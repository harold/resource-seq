(ns resource-seq.core
  (:require [clojure.java.io :as io]
            [clojure.java.classpath :as cp])
  (:import [java.util.jar JarFile JarEntry]
           [java.io File FileInputStream]))

(defn- jarfile->entries
  [^JarFile jarfile]
  (->> (.entries jarfile)
       (enumeration-seq)
       (map (fn [^JarEntry jarentry]
              [(str (.getName jarfile) "/" (.getName jarentry))
               #(.getInputStream jarfile jarentry)]))))

(defn- jarfile-entries
  []
  (->> (cp/classpath-jarfiles)
       (mapcat jarfile->entries)))

(defn- directory->entries
  [directory]
  (->> (file-seq directory)
       (remove (fn [^File file] (.isDirectory file)))
       (map (fn [^File file] [(.getPath file) #(FileInputStream. file)]))))

(defn- directory-entries
  []
  (->> (cp/classpath-directories)
       (mapcat directory->entries)))

(defn resource-seq
  []
  (concat (jarfile-entries)
          (directory-entries)))

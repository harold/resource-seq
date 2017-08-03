(ns simple.core
  (:require [resource-seq.core :refer [resource-seq]])
  (:gen-class))

(defn -main
  [& args]
  (let [items (->> (resource-seq)
                   (filter (fn [[path _]] (.contains path "testfile.txt"))))]
    (println (count items) "item(s) found.")
    (doseq [[path reader-fn] items]
      (println path)
      (println "Content:" (with-open [r (reader-fn)]
                            (slurp r))))))

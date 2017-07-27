(defproject resource-seq "0.1.1-SNAPSHOT"
  :description "Unifying java resources access between repl and jar."
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/java.classpath "0.2.2"]]
  :repl-options {:init-ns resource-seq.core})

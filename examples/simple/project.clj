(defproject simple "0.1.0-SNAPSHOT"
  :description "An application showing the simplest usage of the `resource-seq` lib."
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [resource-seq "0.1.1-SNAPSHOT"]]
  :main ^:skip-aot simple.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})

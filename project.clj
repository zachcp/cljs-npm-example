(defproject hello-cjs "0.1.0-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.9.0-RC2"]
                 [org.clojure/clojurescript "1.9.946"]]
  :jvm-opts ^:replace ["-Xmx1g" "-server"])

; lein trampoline run -m clojure.main build.clj

(defproject examples "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0-alpha14"]
                 [com.middlesphere/clj-terminal "0.1.0-beta"]]
  :main ^:skip-aot examples.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})

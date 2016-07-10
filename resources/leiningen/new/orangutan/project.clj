(defproject {{name}} "0.1.0-SNAPSHOT"
  :description "FIXME: write description."
  :url "http://github.com/theironsamurai/{{name}}"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/math.numeric-tower "0.0.4"]
                 [incanter "1.5.7"]]
  :plugins [[org.clojars.benfb/lein-gorilla "0.3.6"]]
  :main ^:skip-aot dsfs-clj.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})

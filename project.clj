(defproject com.mdrogalis/onyx-metrics "0.6.0-SNAPSHOT"
  :description "Instrumentation for Onyx workflows"
  :url "https://github.com/MichaelDrogalis/onyx"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [com.mdrogalis/rotating-seq "0.1.1"]
                 [com.taoensso/timbre "3.0.1"]
                 [incanter/incanter-core "1.9.0"]]
  :profiles {:dev {:dependencies [[com.mdrogalis/onyx "0.6.0-SNAPSHOT"]
                                  [midje "1.6.3"]]
                   :plugins [[lein-midje "3.1.1"]]}})

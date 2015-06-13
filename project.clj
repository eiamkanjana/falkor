(defproject extract "0.1.0-SNAPSHOT"
  :description ""
  :url "http://"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :plugins [[lein-ring "0.9.5"]]
  :ring {:handler extract.server/handler}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [compojure "1.3.4"]
                 [ring/ring-core "1.3.2"]
                 [ring/ring-json "0.3.1"]
                 [ring/ring-defaults "0.1.4"]
                 [org.jsoup/jsoup "1.8.2"]
                 [cheshire "5.5.0"]])

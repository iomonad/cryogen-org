(defproject io.trosa/cryogen-org "0.1.3-SNAPSHOT"
  :description "A Org-mode module for the Cryogen engine"
  :url "https://github.com/iomonad/cryogen-org"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[clj-org             "0.0.2"]
                 [com.rpl/specter     "1.1.4"]
                 [cryogen-core        "0.4.1"]
                 [org-parser          "0.1.27"]
                 [org.clojure/clojure "1.10.1"]]
  :deploy-repositories [["snapshots" {:url "https://clojars.org/repo"
                                      :username :env/clojars_username
                                      :password :env/clojars_password
                                      :sign-releases false}]
                        ["releases"  {:url "https://clojars.org/repo"
                                      :username :env/clojars_username
                                      :password :env/clojars_password
                                      :sign-releases false}]]
  :profiles {:dev {:source-paths ["dev"]
                   :resource-paths ["resources" "dev-resources"]}}
  :repl-options {:init-ns user})

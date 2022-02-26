(defproject cryogen-org "0.1.0"
  :description "A Org-mode module for the Cryogen engine"
  :url "https://github.com/iomonad/cryogen-org"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [cryogen-core        "0.3.2"]
                 [org-parser          "0.1.4"]]
  :profiles {:dev {:source-paths ["dev"]
                   :resource-paths ["resources" "dev-resources"]}}
  :repl-options {:init-ns user})

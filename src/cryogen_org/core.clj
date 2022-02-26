(ns cryogen-org.core
  (:require [cryogen-core.markup :refer [markup-registry]]
            [clojure.string :as str]
            [clj-org.org :refer [parse-org]]
            [hiccup.core :refer [html]])
  (:import [cryogen_core.markup Markup]))


(defn orgmode
  "Return an OrgMode implementation of
   the cryogen's `Markup` protocol"
  []
  (reify Markup
    (dir [this] "org")
    (exts [this] #{".org"})
    (render-fn [this]
      (fn [rdr config]
        (some->> (java.io.BufferedReader. rdr)
                 (line-seq)
                 (str/join "\n")
                 parse-org
                 :content
                 html)))))

(defn init []
  (swap! markup-registry conj (orgmode)))

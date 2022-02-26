(ns cryogen-org.core
  (:require [cryogen-core.markup :refer [markup-registry rewrite-hrefs]]
            [org-parser.core :as op]
            [clojure.string :as str])
  (:import [cryogen_core.markup Markup]))


(defn convert-to-html
  "Convert OrgMode parsed tree to HTML"
  [org-tree]
  )

(defn orgmode
  "Return an OrgMode implementation of
   the cryogen's `Markup` protocol"
  []
  (reify Markup
    (dir [this] "org")
    (exts [this] #{".org"})
    (render-fn [this]
      (fn [rdr config]
        (let [body  (->> (java.io.BufferedReader. rdr)
                         (line-seq)
                         (str/join "\n"))])))))

(defn init []
  (swap! markup-registry conj (orgmode)))

(ns user
  (:require [org-parser.core :as o]))

(comment
  (o/read-str (slurp "/home/iomonad/org/perso.org")))

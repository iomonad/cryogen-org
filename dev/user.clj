(ns user
  (:require [clojure.java.io :as io]
            [hiccup.core :refer [html]]
            [org-parser.parser :as p]
            [instaparse.transform :as it]
            [com.rpl.specter :as sp]
            [clj-org.org :refer [parse-org]]))

(comment
  (some->> (io/resource "sample.org")
           slurp
           parse-org
           :content)
  (some->> (io/resource "sample.org")
           slurp
           p/parse))

(comment (html (:content (parse-org "#+TITLE: This is an Org Mode file.

* This is the outer section
** This is an inner section
Inner section body -- /with italic text/!  And *bold text* too.

- Plain List Item 1
- Plain List Item 2
[[http://eigenhombre.com][A link to a Web site]]


* My Code

#+begin_src emacs-lisp
  (defun org-xor (a b)
#+end_src
"))))

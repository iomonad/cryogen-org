(ns user
  (:require [clojure.java.io :as io]
            [hiccup.core :refer [html]]
            [clj-org.org :refer [parse-org]]))


(comment
  (some->> (io/resource "sample.org")
           slurp
           parse-org
           :content
           html
           clojure.pprint/pprint))

(comment (html (:content (parse-org "#+TITLE: This is an Org Mode file.

* This is the outer section
** This is an inner section
Inner section body -- /with italic text/!  And *bold text* too.

- Plain List Item 1
- Plain List Item 2
[[http://eigenhombre.com][A link to a Web site]]


* My Code

#+BEGIN_SRC emacs-lisp
  (defun org-xor (a b)
#+END_SRC
"))))

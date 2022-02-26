(ns cryogen-org.core-test
  (:require [clojure.test :refer :all]
            [cryogen-org.core :refer :all]
            [clojure.java.io :as io]
            [org-parser.core :as op]))


(deftest html-convert
  (testing "the HTML tree is correctly parsed"
    (let [parsed-file (some->> (io/resource "sample.org")
                               slurp
                               op/read-str)
          converted-tree (convert-to-html parsed-file)]
      (is (= 4 (count parsed-file))))))

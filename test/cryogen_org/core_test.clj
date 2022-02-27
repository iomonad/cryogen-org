(ns cryogen-org.core-test
  (:require [clojure.test :refer :all]
            [cryogen-org.core :refer :all])
  (:import [cryogen_core.markup Markup]))

;;; Fixtures

(use-fixtures :once
  (fn [body]
    (let [test-ctx true]
      body)))

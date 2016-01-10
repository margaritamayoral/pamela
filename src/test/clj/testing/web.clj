;; Copyright © 2016 Dynamic Object Language Labs Inc.
;;
;; This software is licensed under the terms of the
;; Apache License, Version 2.0 which can be found in
;; the file LICENSE at the root of this distribution.

;;; Acknowledgement and Disclaimer:
;;; This material is based upon work supported by the Army Contracting
;;; and DARPA under contract No. W911NF-15-C-0005.
;;; Any opinions, findings and conclusions or recommendations expressed
;;; in this material are those of the author(s) and do necessarily reflect the
;;; views of the Army Contracting Command and DARPA.

(ns testing.web
  (:require [clojure.test :refer :all]
            [clojure.java.io :refer :all]
            [environ.core :refer [env]]
            [pamela.web :refer :all] ))

(defonce html-test-file "target/test/index.html")

(deftest testing-web
  (testing "testing-web"
    (let [html-file html-test-file]
      (write-html html-file)
      (is (.exists (as-file html-file))))))

(ns cuisine-sorting-hat.core-test
  (:require [clojure.test :refer :all]
            [cuisine-sorting-hat.core :refer :all]))

(deftest in-set
  (testing "testing if return in set"
    (is (contains? countries (rand-country countries excluded-countries))))
  (testing "not in exclusions"
    (is (not (contains? excluded-countries
                        (rand-country countries excluded-countries))))))

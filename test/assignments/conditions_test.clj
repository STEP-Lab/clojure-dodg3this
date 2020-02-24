(ns assignments.conditions-test
  (:require [clojure.test :refer :all]
            [assignments.conditions :refer :all]))

(deftest safe-division
  (testing "non zero denominator"
    (is (= 2 (safe-divide 4 2))))
  (testing "zero denominator"
    (is (nil? (safe-divide 3 0)))))

(deftest informative-division
  (testing "non zero denominator"
    (is (= 2 (informative-divide 4 2))))
  (testing "zero denominator"
    (is (= :infinite (informative-divide 3 0)))))

(deftest harishchandra-says
  (testing "the same if truthy"
    (is (= 4 (harishchandra 4))))
  (testing "nothing if false"
    (is (nil? (harishchandra false))))
  (testing "nothing if nil"
    (is (nil? (harishchandra nil)))))
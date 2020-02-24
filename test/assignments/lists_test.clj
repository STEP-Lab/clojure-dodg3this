(ns assignments.lists-test
  (:require [clojure.test :refer :all]
            [assignments.lists :refer :all]))

(deftest lists
  (testing "map"
    (testing "identity with single coll"
      (is (= [1 2 3] (map' identity [1 2 3]))))
    (testing "addition with double coll"
      (is (= [5 7 9] (map' + [1 2 3] [4 5 6]))))
    (testing "addition with multi collections should only return sequence with length of the smallest collection"
      (is (= '(6 9) (map' + '(1 2 3) [4 5 6 7] '(1 2)))))))
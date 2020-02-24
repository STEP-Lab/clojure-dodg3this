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

(deftest yudishtira-says
  (testing "the same if truthy"
    (is (= 4 (yudishtira 4))))
  (testing "ashwathama if false"
    (is (= :ashwathama (yudishtira false))))
  (testing "ashwathama if nil"
    (is (= :ashwathama (yudishtira nil)))))

(deftest duplicate-first-returns
  (testing "the coll wih first element repeated"
    (is (= [1 1 2 3] (duplicate-first [1 2 3]))))
  (testing "nil if collection is empty"
    (is (nil? (duplicate-first [])))))

(deftest five-point-someone-returns
  (testing "chetan-bhagat if y is 5"
    (is (= :chetan-bhagat (five-point-someone 3 5))))
  (testing "chetan-bhagat if y is 5 and x is 5"
    (is (= :chetan-bhagat (five-point-someone 5 5))))
  (testing "chetan-bhagat if y is 5 and x is greater than y"
    (is (= :chetan-bhagat (five-point-someone 6 5))))
  (testing "satan-bhagat if x is 5"
    (is (= :satan-bhagat (five-point-someone 5 4))))
  (testing "greece if x is greater than y"
    (is (= :greece (five-point-someone 6 4))))
  (testing "else returns :universe"
    (is (= :universe (five-point-someone 3 3)))))

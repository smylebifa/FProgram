; Command include file...
;(load-file "src/main/clojure/main.clj")

; Create lazy sequence...
(defn whole-numbers [] (iterate inc 1))

; Function with sequence, predicate as param
; return 10 elements of 2 sequences for predicates...
(defn func1 [seq predicate1 predicate2]
  (let [a (filter predicate1 (seq))
        b (filter predicate2 (seq))]
    (println (take 10 a) (take 10 b))))

; Command to start function...
;(func1 whole-numbers odd? even?)


; Trying to make function with 1 parameter...
;(defn func2 [seq predicate]
;  (let [a (filter predicate (seq))
;        b (filter even? (seq))]
;    (println (take 10 a) (take 10 b))))
;(func2 whole-numbers odd?)
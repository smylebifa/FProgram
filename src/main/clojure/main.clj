; Command include file...
;(load-file "src/main/clojure/main.clj")

; Create lazy sequence...
(defn whole-numbers [] (iterate inc 0))

; Function get sequence and predicate
; and return 2 sequence - satisfying and unsatisfying the condition of predicate...
(defn separate [seq pred]
  (let [a (filter pred (seq))
        b (filter (complement pred) (seq))]
    [a b]))

; Testing function...
;(take 10 (first(separate whole-numbers even?)))
;(take 10 (last(separate whole-numbers even?)))
;(reduce + (take 10 (last (separate whole-numbers even?))))
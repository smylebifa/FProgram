; Command include file...
;(load-file "src/main/clojure/main.clj")


; Create lazy sequence...
(defn whole-numbers [] (iterate inc 1))


; Function get sequence and predicate and return sequence,
; satisfying the condition of predicate...
(defn funcx [seqIn pred]
  (when-not (empty? seqIn)
    (if (odd? (first seqIn))
      (recur (rest seqIn) pred)
      (cons (first seqIn) (lazy-seq (funcx (rest seqIn) pred))))))


; Function get sequence and predicate and return sequence,
; unsatisfying the condition of predicate...
(defn funcxn [seqIn pred]
  (when-not (empty? seqIn)
    (if-not (odd? (first seqIn))
      (recur (rest seqIn) pred)
      (cons (first seqIn) (lazy-seq (funcxn (rest seqIn) pred))))))


; Function with sequence, predicate as param
; return 2 sequences satisfying and unsatisfying the condition of predicate...
(defn func [seq pred]
  (println (funcx seq pred) (funcxn seq pred)))


; Command to start function...
;(func (take 10 (whole-numbers)) even?)

; command include file
; (require '[clojuredemo.core])

; lazy sequence
(defn whole-numbers [] (iterate inc 1))

; function with sequence as param
; return 2 sequences with condition ( < 5) or ( >= 5)
(defn func [s]
  (split-with #(< % 5) (take 15 (s))))

; command to start function
; (func whole-numbers)
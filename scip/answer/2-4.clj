(ns scip)
(defn cons [x y]
  (fn [m]
    (m x y)
  )
)

(defn car [z]
  (z (fn [p q] p))
)

(defn cdr [z]
  (z (fn [p q] q))
)

(print (car (cons :a :b)))
(print \newline)
(print (cdr (cons :a :b)))

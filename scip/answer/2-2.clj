(defn make-point [x y]
  (list x y)
)

(defn x-point [p]
  (first p)
)

(defn y-point [p]
  (last p)
)

(defn make-segment [p1 p2]
  (list p1 p2)
)

(defn start-segment [segment]
  (first segment)
)

(defn end-segment [segment]
  (last segment)
)

(defn mid-value [x1 x2]
  (/ (+ x1 x2) 2)
)

(defn midpoint-segment [segment]
  (let [p-start (start-segment segment)
        p-end (end-segment segment)]
    (make-point (mid-value (x-point p-start) (x-point p-end)) (mid-value (y-point p-start) (y-point p-end)))
  )
)

(defn print-point [point]
  (print \()
  (print (x-point point))
  (print \,)
  (print (y-point point))
  (print \))
  (print \newline)
)

(print-point (midpoint-segment (make-segment (make-point 1 2) (make-point 4 6))))

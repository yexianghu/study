(defn reverse-to-list [from-list to-list]
  (if (> (count from-list) 0)
    (reverse-to-list (rest from-list) (cons (first from-list) to-list))
    to-list
  )
)
(defn reverse-list [list]
  (reverse-to-list list (empty list))
)

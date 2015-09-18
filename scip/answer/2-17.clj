(defn last-pair [list]
  (if (= (count list) 1)
    (first list)
    (last-pair (rest list))
  )
)

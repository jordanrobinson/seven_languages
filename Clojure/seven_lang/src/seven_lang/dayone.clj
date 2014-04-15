(ns seven-lang.dayone)

;;exercise one - implement a function called (big st n) that returns true if a string st is longer than n characters
(defn big
  "returns true if a string is big"
  [st, n]
  (if (> (count st) n)
    true false)
  )
;;exercise two - write a function called (collection-type col) that returns the type of collection given
(defn collection-type
  "returns which collection type was provided"
  [col]
  (type col)
  )

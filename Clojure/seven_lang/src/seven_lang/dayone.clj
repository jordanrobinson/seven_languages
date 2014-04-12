(ns seven-lang.dayone)

(defn big
  "returns true if a string is big"
  [st]
  (if (> (count st) 4)
    true false)
  )

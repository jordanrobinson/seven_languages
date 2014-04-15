(ns seven-lang.core
  (require seven-lang.dayone))

(defn hello
  "simple hello world"
  []
  (println "Hello there clojure"))

(defn run
  "runs today's exercises"
  []
  (println
    (seven-lang.dayone/big "sup" 5))
  (println
    (seven-lang.dayone/big "hello there" 4))
  (println
    (seven-lang.dayone/collection-type ["Light Arrows", "Fire Arrows", "Ice Arrows"]))
  (println
    (seven-lang.dayone/collection-type {:dodongo "Bomb", :keese "Hookshot"}))
  )

(run)
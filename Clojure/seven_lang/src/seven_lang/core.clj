(ns seven-lang.core
  (require seven-lang.dayone)
  (require seven-lang.daytwo)
  (require seven-lang.daythree)
  )

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
  (seven-lang.daytwo/unless false (println "true!"))
  (seven-lang.daytwo/unless true (println "true!"))
  (seven-lang.daytwo/unlesselse true (println "true!") (println "false!"))
  (seven-lang.daytwo/unlesselse false (println "true!") (println "false!"))
  (seven-lang.daytwo/test-things)
  (seven-lang.daythree/do-banking)
  )

(run)
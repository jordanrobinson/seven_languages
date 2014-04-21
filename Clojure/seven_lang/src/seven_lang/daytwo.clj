(ns seven-lang.daytwo)

;exercise one - implement an unless with an else condition using macros

(defmacro unless [test body] ;this is the original, similar to the book example
  (list 'if (list 'not test) body)
  )
(defmacro unlesselse [test body otherwise] ;this is the original, similar to the book example
  (list 'if (list 'not test) body otherwise) ;I could be missing something here, this seems deceptively simple
  )

;exercise two - write a type using defrecord that implements a protocol

(defprotocol Test
  (pass-test [this test-name])
  (fail-test [this test-name])
  )

(defrecord Tester [name]
  Test
  (pass-test
    [this test-name] (println (str test-name " is a Success!"))
    )
  (fail-test
    [this test-name] (println (str test-name " is a Failure!"))
    )

  )

(defn test-things
  "Uses the tester"
  []
  (def tester (Tester. "Test man"))
  (pass-test tester "this test")
  (fail-test tester "that test")
  )
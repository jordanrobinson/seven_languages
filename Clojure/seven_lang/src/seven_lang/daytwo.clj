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
  (pass-test [this])
  (fail-test [this])
  )

(defrecord Tester [name]
  Test
  (pass-test
    [this] (println "Success!")
    )
  )
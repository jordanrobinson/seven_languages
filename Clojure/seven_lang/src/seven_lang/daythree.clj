(ns seven-lang.daythree)

;exercise one - use refs to create a vector of accounts in memory. Create debit and credit functions to change the balance of an account

(def accounts (ref []))

(defn credit-account
  [account amount]
    (dosync
      (alter (get accounts account) + amount))
  )

(defn debit-account
  [account amount]
  (dosync
    (alter (get accounts account) - amount)
    )
  )

(defn open-new-account
  []
  (dosync (alter accounts conj 0))
  )


(defn do-banking
  "makes use of the account based methods to test their functionality."
  []
  (open-new-account)
  (println (get accounts 0))
  (println accounts)
  (credit-account 0 100)
  (println accounts)
  (debit-account 0 40)
  (println accounts)
  )


;exercise two - the sleeping barber problem
;; devemos criar uma função que nos retorne:
;; fizz, se o número for divisível por 3;
;; buzz , se divisível por 5;
;; fizzbuzz , se divisível por 3 e por 5; ou
;; o próprio número, caso contrário.

(defn divisivel-por? [dividendo divisor]
    (zero? (mod dividendo divisor)))


(defn fizzbuzz [numero]
    (cond (and (divisivel-por? numero 3)
                (divisivel-por? numero 5)) "fizzbuzz"
        (divisivel-por? numero 3) "fizz"
        (divisivel-por? numero 5) "buzz"
     :else numero)
)

(fizzbuzz 15)
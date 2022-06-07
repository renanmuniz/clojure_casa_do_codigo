(defn teste-and [n1 n2]
    (and (> n1 0) (> n2 0)))

(teste-and 2 10) ;true
(teste-and -2 10) ;false


(defn teste-or [n1 n2]
    (or (> n1 0) (> n2 0)))

(teste-or 2 10) ;true
(teste-or -2 10) ;true
(teste-or -2 -10) ;false
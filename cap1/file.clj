;INTRODUCAO
(+ 1 2) ;3
(/ 10 5) ;2
(- 0 2) ;-2

(* 2 (+ 3 3)) ;12

(str "Olá, " "mundo!") ;"Olá, mundo!"

(= "joao" "maria") ;false

(= "joao" "joao") ;true

(even? 2) ;Par? true

(even? 3) ;Par? false

(odd? 2) ;Impar? false

(odd? 3) ;Impar? true

(mod 9 3) ;0
(= 0 (mod 9 3)) ;Multiplo de 3?


;FUNCOES
(defn oi [nome]
    (str "Oi, " nome "!"))    ;#'user/oi Isso quer dizer que oi foi criado no namespace("pacote") user.

(oi "Renan") ;=> "Oi, Renan!"


;Multiplo de 3?
(defn multiplo-de-3? [dividendo]
    (= 0 (mod dividendo 3)))

(multiplo-de-3? 9) ;true
(multiplo-de-3? 8) ;false


;CONDICIONAIS
(defn par? [numero]
    (if(even? numero)
        "sim"
        "não"))

(par? 2) ;sim
(par? 3) ;nao


(defn saldo [valor]
    (cond 
        (< valor 0) "Negativo"
        (> valor 0) "Positivo"
        :else "Zero"))

(saldo 100) => "Positivo"
(saldo -10) => "Negativo"
(saldo 0) => "Zero"




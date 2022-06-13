* (defn resumo [transacao]
    (select-keys transacao [:valor :tipo :data]))

(def transacoes
  [{:valor 33.0 :tipo "despesa" :comentario "almoco" :data "19/11/2016"}
   {:valor 2700.0 :tipo "receita" :comentario "Bico" :data "01/12/2016"}
   {:valor 29.0 :tipo "despesa" :comentario "Livro de Clojure" :data "03/12/2016"}])

(map resumo transacoes)

(defn despesa? [transacao]
  (= (:tipo transacao) "despesa"))

(defn receita? [transacao]
  (= (:tipo transacao) "receita"))

(filter despesa? transacoes)
(filter receita? transacoes)

(defn so-valor [transacao]
    (:valor transacao))

(map so-valor (filter despesa? transacoes))
(reduce + (map so-valor (filter despesa? transacoes))) ;;=> 62    reduce combina todos os itens de uma colecao aplicando a funcao 

(reduce * (map so-valor (filter despesa? transacoes)))  ;;=> 957.0

(defn valor-grande? [transacao]
    (> (:valor transacao) 100))

(filter valor-grande? transacoes)


;; funcoes anonimas
;; funcoes criadas para utilizacao na hora, nao pode ser referenciada depois

((fn [nome] (println "Olá, " nome "!")) "Renan")

(* 2 ((fn [valor](* 2 valor)) 10 ))   ;; => 40


;; filtrando transacoes usando funcoes anonimas:
(filter (fn [transacao] (> (:valor transacao) 100)) transacoes)


;; forma curta de declarar funcoes anonimas:
(filter #(> (:valor %) 100) transacoes)


(println(filter #(> (:valor %) 100) transacoes))


(reduce + 
  (map #(:valor %) 
    (filter #(= (:tipo %) "despesa")
      transacoes)))


;; thread-first macro:
;; passa o resultado da funcao como primeiro parametro para a proxima.
(so-valor (first transacoes))

(-> 
  (first transacoes)
  (so-valor))

(-> 
  (+ 10 10)
  (* 2)
  )

(-> 
  (+ 2 2)
  (- 10))
;; (- (+ 2 2) 10) => (- 4 10)  => -6


;; thread-last macro:
;; passa o resultado da funcao como ultimo parametro para a proxima.
(->> 
  (filter despesa? transacoes)
  (map so-valor)
  (reduce +))

(->> 
    (+ 2 2)
    (- 10))
  ;; (- 10 (+ 2 2)) => (- 10 4)  => 6












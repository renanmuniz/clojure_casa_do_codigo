;; cirando um mapa chave valor
(hash-map :valor 200 :tipo "receita")


(def transacao {:valor 200 :tipo "receita"})
;; :valor, :tipo são keywords, ou símbolos. Utilizados para definir uma "chave" do mapa.

(println transacao)
;; {:valor 200, :tipo receita}

(get transacao :valor) 
;; => 200

(assoc transacao :categoria "Educacao")
;; => {:valor 200, :tipo "receita", :categoria "Educacao"}

(println transacao)
;; {:valor 200, :tipo receita}   !IMUTABILIDADE!

(:valor transacao)
;; => 200

(def transacao-desnecessaria {:valor 34 :tipo "despesa" :rotulos '("desnecessária" "cartão")})
(:rotulos transacao-desnecessaria)
;;=> ("desnecessária" "cartão")
(:rotulos transacao)
;;=> nil    não achou a keyword/simbolo(chave) do mapa, então retorna nulo(nil)

(:rotulos transacao '("não encontrado"))
;;=> ("não encontrado")

;; é boa prática não retornar nulos! Mas sim vazios! Como a seguir:

(:rotulos transacao '())
;; => ()      caso não encontre a keyword/simbolo(chave) do mapa, retorne o seguinte.









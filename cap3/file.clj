;LISTAS
(list 1 2 3 4 5 6)

'(1 2 3 4 5 6) 
;; Sem o apóstrofo, a interpretação seria de que 1 seria
;; compreendido como uma função, e seria aplicada aos demais
;; argumentos. Com o apóstrofo, instruímos que a lista seja
;; interpretada como uma simples lista, sem execução de função
;; alguma.


; NOME A UMA LISTA:
(def um-ate-cinco '(1 2 3 4 5)) ;seria como uma 'declaracao de variavel'
(println um-ate-cinco)
(count um-ate-cinco)


(def um-ate-15 (range 1 16)) ;funcao range é não inclusiva, ou seja vai até o ultimo -1
(println um-ate-15)


;fizzbuzz com lista:

(defn divisivel-por? [dividendo divisor]
    (zero? (mod dividendo divisor)))


(defn fizzbuzz [numero]
    (cond (and (divisivel-por? numero 3)
                (divisivel-por? numero 5)) "fizzbuzz"
        (divisivel-por? numero 3) "fizz"
        (divisivel-por? numero 5) "buzz"
     :else numero)
)

(map fizzbuzz um-ate-15) ;map aplica a funcao, no caso 'fizzbuzz', à lista, no caso 'um-ate-15'


;VETORES:
;; Os vetores são como os famosos arrays, começando da posição 0,
;; e podem guardar elementos de qualquer tipo, permitindo a busca dos
;; elementos através do índice. Vetores são eficientes para adicionar
;; itens ao final, enquanto listas, para adicionar itens no início.

(vector 1 2 3 4 5)

[1 2 3 4 5]

(def numeros-vetorizados [1 2 3 4 5 6 7 8 9 10 11 12 13 14 15])

(println numeros-vetorizados)

(map fizzbuzz numeros-vetorizados) ;muitas funcoes funcionam tanto para lista quanto vetores

(get numeros-vetorizados 0) ;; => 1
(get numeros-vetorizados 14) ;; => 15
(get numeros-vetorizados 15) ;; => nil

(def vetor-nome-sobrenome ["renan" "muniz" "merlo"])

(map println vetor-nome-sobrenome)
;; renan
;; muniz
;; merlo

(println vetor-nome-sobrenome) 
;;[renan muniz merlo]

(get vetor-nome-sobrenome 2)
;;"merlo"

(get vetor-nome-sobrenome 3)
;;nil

(get vetor-nome-sobrenome 0)
;;"renan"

;; incluir um novo item ao vetor:
(def vetor-nome-endereco-telefone ["renan" "rua"])

(println vetor-nome-endereco-telefone) 
;;[renan rua]

(conj vetor-nome-endereco-telefone "(43)91234-5678")
;;=> ["renan" "rua" "(43)91234-5678"]

(println vetor-nome-endereco-telefone) 
;;[renan rua]  
;;!!! Mesmo adicionando acima um dado ao vetor, ao imprimir retorna o conteudo original do vetor declarado.
;; Isso ocorre porque clojure tem estruturas de dados imutaveis, ou seja, nao se pode alterar.
;; Pode-se fazer algo com ela e retorna-la, como feito em (conj vetor-nome-endereco-telefone "(43)91234-5678").


;; Em listas, não conseguimos pegar um elemento pelo indice,
;; mas podemos usar a funcao nth para pegar o elemento de numero x
;; um porém é que ele precisa percorrer toda a lista contando até chegar em x
(def lista(list 1 2 3 4 5 6 7 8 9 10))

(nth lista 9)
;; => 10

(nth lista 0)
;; => 1

(nth lista 10)
;; => (IndexOutOfBoundsException)



;; SETs
;; set é uma lista com valores únicos(não se repetem) e sem ordem definida dos elementos.
(hash-set 1 2 3 4 5)
;; => #{1 4 3 2 5}

(hash-set 1 2 3 4 5 5)
;; => #{1 4 3 2 5}   nao atribui o duplicado

#{1 2 3 4 5}
;; => #{1 4 3 2 5}

#{1 2 3 4 5 5}
;; Da exception:
;; Syntax error reading source at (Cap3/file.clj:2:15). Duplicate key: 5 

#{"renan" "muniz" "merlo"}
;; => #{"renan" "merlo" "muniz"}

#{"renan" "muniz" "merlo" "muniz"}
;; Da exception:
;; Syntax error reading source at (Cap3/file.clj:2:35). Duplicate key: muniz


(def cargos #{"desenvolvedor" "tester" "techlead" "QA"})

(println cargos)
;; #{desenvolvedor tester QA techlead} 
;; => nil

(map println cargos)
;; desenvolvedor
;; tester
;; QA
;; techlead
;; => (nil nil nil nil)

(conj cargos "gestor")
;; => #{"desenvolvedor" "tester" "QA" "techlead" "gestor"}

(println cargos)
;; #{desenvolvedor tester QA techlead}   !IMUTABILIDADE! lembra?

(conj cargos "tester")
;; não aparece duplicado
;; => #{"desenvolvedor" "tester" "QA" "techlead"}







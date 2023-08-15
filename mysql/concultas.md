# Consultas


O comando *SELECT* permite ao usuário especificar uma consulta *("query")* como uma descrição do resultado desejado. 

Esse comando pode ser composto por várias cláusulas e opções de filtro, possibilitando elaborar consultas das mais simples às mais elaboradas.

Exemplo:

select * from pessoa

Esse comando pode ser lido da seguinte forma:

<p align="">
  <img alt="" src="https://github.com/rxaviersantos/software-testing/assets/85380530/ee7309f9-7d19-4ffb-8fe3-af9613a98633" " height="300px" width="520px"> </p>

### Operadores Condicionais

= Igualdade

Usa apenas um sinal de igual ("=") e retorna todos os valores iguais ao valor de comparação. Este filtro é o uso mais comum, como para encontrar os dados de uma chave/índice específico. Por exemplo: select * from pessoa where id = 3.

<> Diferença

Usa os símbolos de maior-menor juntos (“<>”) e retorna todos os valores diferentes do valor de comparação. Por exemplo, retorne todos os pessoas, exceto o "Pedro": select * from pessoa where nome <> "Pedro".

< Menor

Funciona da mesma forma, usando o símbolo de menor mesmo (“<”) e retorna todos os valores que são menores que a condição. Por exemplo, para retornar todas as pessoas com menos de 20 anos: select * from pessoa where idade < 20.

> Maior

Funciona da mesma forma, usando o símbolo de maior mesmo (“>”) e retorna todos os valores que são maiores que a condição. Por exemplo, para retornar todos as pessos com mais de 20 anos: select * from pessoa where idade > 20.

>= Maior ou Igual

Funciona de forma semelhante, usando o sinal de igual seguido do sinal de maior (“=>”) e retorna todos os valores que são maiores ou iguais à condição. Por exemplo, para retornar todos as pessoas com 20 anos ou mais: select * from pessoa where idade >= 20.


### Comando LIKE

Além dos operadores de comparação que já conhecemos, o SQL possui um outro comando para realizar comparações, estamos falando do comando LIKE. O comando "LIKE" (que significa "igual") funciona da mesma forma que o operador de igualdade.

Ou seja, os comandos abaixo executam a mesma busca com filtro:

````sql
select * from pessoa where nome = "Luiza"

select * from pessoa where nome like "Luiza"
``````



O comando LIKE, quando usado com outros caracteres coringa, se torna uma ferramenta extremamente poderosa e versátil.

Caractere "%" (percento)
O caractere % é um coringa que desconsidera qualquer caractere, não importando a quantidade. Por exemplo, o comando a seguir busca apenas a primeira e a última letra do nome:


```sql
select * from pessoa where nome like "A%a"
````

Como resultado, nomes como "Anna", "Ana", "Adriana", “Angela" etc, todos os nomes onde a primeira letra seja igual a "A" e a última letra seja igual a "a", não importando o que tem no meio, nem sua quantidade.

 

Da mesma forma, o coringa pode ser usado apenas no início ou apenas no fim da palavra ou frase, para buscar textos que terminam ou iniciam com o trecho buscado. Por exemplo:

<p align="">
  <img alt="" src="https://github.com/rxaviersantos/software-testing/assets/85380530/50b80628-5299-4182-a041-e38a26a6f6f8" " height="400px" width="520px"> </p>


Caractere "_" (underline)
Caractere "_" (underline)

 

O caractere "_" (underline) funciona de forma semelhante ao "%" (percento), com uma única diferença: enquanto o "%" considera qualquer coisa de qualquer tamanho, o "_" usa como coringa apenas um único caractere. Por exemplo, o comando abaixo busca o nome que inicia com "Mari", mas que pode ter qualquer letra no local de "_":

 
```sql
select * from pessoa where nome like "Mari_"
```

Como resultado, viriam os nomes como "Mario", "Maria" e "Marie". O interessante é que o nome "Mari", com apenas 4 letras, não viria como resultado, pois o coringa "_" espera que exista algum caractere nessa posição.

### Operadores Lógicos

Os operadores lógicos também funcionam da mesma forma no SQL. 

A única diferença é que aqui no SQL são usados os nomes em vez de símbolos.

*Operador "AND"*

Como em qualquer linguagem de programação, usamos o operador "AND" para criar uma expressão lógica no SQL em que todas as condições sejam verdadeiras. Por exemplo, no código abaixo buscamos registros que contenham pessoas jovens com problema de obesidade:

```sql
select * from pessoa where idade < 20 and peso > 60
```

*Operador "OR"*

Da mesma forma, o operador "OR" funciona como em qualquer linguagem, quando precisamos que apenas uma das condições seja verdadeira. Por exemplo, no código abaixo buscamos registros de pessoas que tenham menos de 20 anos ou menos de 60 quilos de peso:

```sql 
select * from pessoa where idade < 20 or peso < 60
```

*Operador "NOT"*

O operador "NOT" funciona da mesma forma, negando qualquer condição. Seu uso muito comum é combinado com o operador "LIKE". Como exemplo, temos a situação em que precisamos buscar os registros de pessoas que não tenham seu nome iniciado com a letra "P":

```sql 
select * from pessoa where nome not like "P%"
```

Esta condição retornaria qualquer nome, exceto os que se iniciam com a letra "P".

*Operador "NULL"*

O operador "NULL" não faz parte dos operadores lógicos, apenas está sendo apresentado aqui para fechar os conceitos dos comandos de seleção e filtro do SQL. Como vimos, alguns campos podem aceitar o valor NULL, ou seja, podem ser vazios. Em nosso exemplo, permitimos que os campos "idade" e "peso" sejam do tipo NULL, ou seja, são opcionais.


O operador NULL não é um valor, então não podemos usá-lo para efetuar comparações com outros valores. Isso significa que, mesmo havendo valores nulos na tabela, o comando a seguir não funcionaria:

```sql 
select * from pessoa where peso = NULL
```

Para que funcione, precisamos saber se o campo "está" vazio. Portanto, precisamos usar outro comando, chamado "IS" ("é", "está", em inglês). O código ficaria da seguinte forma:


```sql 
select * from pessoa where peso is NULL
```

O comando acima retorna todos os registros "sem peso". Para garantir que os registros possuam a informação, ou seja, que elas realmente existem, temos que usar o operador NOT, e retornamos todos os registros "com peso":


```sql 
select * from pessoa where peso is not NULL
```
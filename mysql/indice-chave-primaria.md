# Índice e chaves primárias

O *índice primário* ou *primary key* da tabela vem sempre na primeira posição e geralmente a nomeamos como *"id", "id_pessoa"*, *"codigo_pessoa" ou "cod_pessoa"*, nesse caso da tabela "pessoa", que são nomes que demonstram que essa coluna possui o índice chave da tabela, seu índice primário.

<p align="">
  <img alt="" src="https://github.com/rxaviersantos/software-testing/assets/85380530/d8ec58d6-92d5-4a8f-a14a-1acd650488c2" " height="300px" width="520px"> </p>

A PK (sigla de Primary Key) da tabela funciona da mesma forma que o índice do array.

Caso a coluna seja um índice, além da propriedade Primary Key (PK), ela deve receber também a propriedade Auto Increment (AI). 

Agora sim, com estas duas propriedades definidas para a coluna "id", seu conteúdo será automatizado e de controle do banco de dados.

### Propriedades das colunas e organização das tabelas

Propriedade UNIQUE KEY (UK)

Exemplo: as pessoas agora precisam ter acesso ao sistema, então precisam ter uma conta de acesso (login).

Podemos usar várias coisas para representar a conta de acesso, como:

1. E-mail

2. Número do CPF

3. Número de matrícula

4. Nick name (apelido)


Qualquer um desses acessos serve para identificar uma pessoa, porém, não podemos ter nenhuma conta de acesso repetida, cada pessoa deve sua própria conta, pessoal, ou seja, uma chave única (unique key) em todo o sistema!

Com isso, agora a tabela de pessoa precisa sinalizar para o banco de dados que um valor de uma linha não pode ser igual a outro. 

A propriedade de usamos é a UNIQUE KEY ou sua sigla UK.  

A tabela de pessoa agora fica de acordo com o exemplo ao lado.

Adicionamos a coluna "cpf" com a propriedade UK.

Podemos definir as colunas *"nome" e "matrícula"* como *NOT NULL (NN)*, ficando os campos *"idade" e "peso"* de preenchimento opcional, ou seja, "idade" e "peso" permitem *nulos* (são nulos).

<p align="">
  <img alt="" src="https://github.com/rxaviersantos/software-testing/assets/85380530/a43917ce-2169-4898-88c2-40ad44ed07c6" " height="300px" width="520px"> </p>

Campo UK

Definindo um campo como UK, o banco de dados passa a controlar seu conteúdo, não permitindo que outro valor semelhante seja adicionado na mesma coluna.

Cancelamento

Ao tentar inserir um valor que já existe, o banco de dados emite um erro informando que está ocorrendo uma violação da propriedade unique key da coluna, cancelando a tentativa de salvar a informação.

primary key (PK) e auto increment (AI)

A coluna "id" está definida como primary key (PK) e auto increment (AI), sendo de controle do banco de dados. 

Portanto, não precisamos definir a chave "id" como UK, pois temos a garantia de que terão apenas valores únicos, visto que removemos um registro e inserimos novamente e ele não reaproveitou os índices removidos (ids 3 e 4).


# Banco de dados fundamentos 

## Conceitos básicos 

As primeiras aplicações faziam a persistência dos dados em arquivos de texto comum, tais aplicações utilizavam eram escritas em linguagens como Cobol, Fortran e C. 

Em função da forma como eram construídas, sem necessidade de nenhuma outra tecnologia para o seu funcionamento, eram classificadas como aplicações monolíticas.

Vamos ver um exemplo.

Um cadastro de clientes em um único computador, que armazena as informações em arquivos de texto, no próprio computador, sem acesso a qualquer outra fonte de dados.

Neste contexto, um único computador funciona como cliente (utilizado pelo usuário), servidor de aplicação e servidor de dados, funcionando assim de forma monolítica, ou seja, uma relação de vínculo em que a aplicação e os dados, são pares de um bloco único, sem possibilidade de funcionamento de forma independente ou distribuído.

<p align="">
  <img alt="" src="https://github.com/rxaviersantos/software-testing/assets/85380530/066938f9-7745-4ae9-997c-b95fa09f43b9" " height="300px" width="520px"> </p>

Com a evolução dos negócios e a necessidade da distribuição dos acessos para mais de um ponto e perfil, a estrutura monolítica deixou de ser interessante, pois não atendia tal requisito, porque os dados precisam estar centralizados para que estejam acessíveis a todos os "clientes" do sistema. 

<p align="">
  <img alt="" src="https://github.com/rxaviersantos/software-testing/assets/85380530/6ec846bb-ea84-4f59-b374-4c3584f8c43c" " height="400px" width="620px"> </p>

Na arquitetura em três camadas, os dados ficam em um servidor exclusivo de BD (banco de dados), sem exposição a qualquer outro servidor que não seja o servidor de aplicação, garantindo assim a segurança dos dados.

<p align="">
  <img alt="" src="https://github.com/rxaviersantos/software-testing/assets/85380530/d3583d19-7498-439c-b7fa-7015aaa25fb9" " height="400px" width="620px"> </p>

Estruturas monolíticas

Em estruturas monolíticas, os aplicativos têm a responsabilidade de criar, acessar e gerenciar os dados salvos nos arquivos de texto.

Banco de dados

Com a adoção de bancos de dados, a estrutura se torna mais complexa e precisa de um sistema próprio com as seguintes funções:


Gerenciamento dos arquivos de dados.

Gerenciamento da segurança (criptografia).

Gerenciamento dos conflitos e acesso simultâneo aos dados, entre outros.

Gerenciamento dos acessos (usuários e senhas).

Este sistema específico é chamado de SGBD.


### Tipos de bancos de dados: 

*Banco de dados Não relacional* 

É o exemplo do uso de arquivos, pois sua estrutura não possui qualquer relação entre eles, com total independência uns dos outros. 

*Banco de dados Relacional*

Sua estrutura possui entre si, ou seja, um tipo de dados possui uma ligação ou integração entre eles. Este modelo é o tipo da grande maioria dos bancos de dados, como o Microsoft SQL Server, Oracle, MySQL, PostgresSQL etc.

*Banco de dados de Documentos* 

O banco de dados do modelo documento utiliza a estrutura de dados do JSON para armazenamento dos dados. Este modelo é usado pelo MongoDB, Google Firebase, Google Cloud, Firestone, entre outros. 

*Banco de dados Key-value*

Este modelo utiliza a estrutura de dados de chave-valor. Como exemplo, temos o Redis, Oracle, NoSQL, Amazon SimpleDB, entre outros.

*Banco de dados Search engine*

São banco de dados específicos usados como mecanismo de busca e acesso rápido a dados de grande volume. Como exemplo, temos Elastic Search, Microsoft Azure Search, Amazon Cloud Search, entre outros. 


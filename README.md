# Cities API REST - Projeto de API em JAVA

# 1) Sobre o projeto

Esta aplicação consiste na utilização de recursos como geo localização e coordenadas geográficas para calcular a distancia entre duas cidades brasileiras, utilizando recursos do PostgreSQL, que contem bibliotecas nativas para efetuar o calculo das coordenadas.

# 2) Tecnologias utilizadas

- Git
- Java 11
- Docker
- IntelliJ Community
- Heroku CLI

# 3) Instalação e execução local

- Faça um clone desse repositório;
- Entre na pasta cd cities.api;
- Abra o codigo em sua IDE (foi utilizada a IDE Intellij para a criação da API) e aguarde a atualização do Gradle.
- Execute sua classe Main

# 4) End Points

- Para conferir os dados de todas as cidades do Brasil:

https://salty-eyrie-95198.herokuapp.com/cities

- Para conferir os dados de todos os estados do Brasil:

https://salty-eyrie-95198.herokuapp.com/states

- Para conferir os dados de todos os países do Mundo:

https://salty-eyrie-95198.herokuapp.com/countries

- Os países contém uma paginação que pode ser alterada pelos seguintes end points:

{w} = Número da página que será exibido
{x} = Quantidade de itens que serão exibidos por página
{y} = Campo da tabela ["id", "name", "portugueseName", "code","bacen"]
{z} = Ordem a ser exibibida, crescente ou decrescente [asc, desc]

https://salty-eyrie-95198.herokuapp.com/countries?page={w}&size={x}&sort={y},{z}

- Também é possível acessar um único país por id pelos end points:

https://salty-eyrie-95198.herokuapp.com//contries/{id}

- Para calcular a distancia entre duas cidades em metros:

https://salty-eyrie-95198.herokuapp.com/distances/by-cube?from={id}&to={id}

# Autor

Rogério Martins dos Santos

- Linkedin:
  https://www.linkedin.com/in/rogermds/

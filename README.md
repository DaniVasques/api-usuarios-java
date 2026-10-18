# 👤 API de Usuários — Java, Spring Boot e JWT

API REST desenvolvida em **Java com Spring Boot** para gerenciamento de usuários, com persistência em PostgreSQL, validação de dados, documentação via Swagger/OpenAPI e autenticação utilizando **Spring Security + JWT**.

O projeto foi desenvolvido com foco em Back-End, organização em camadas e segurança de APIs, permitindo praticar não apenas cadastro e persistência de dados, mas também todo o fluxo de autenticação e proteção de endpoints.

---

## 🚀 Tecnologias utilizadas

- Java
- Spring Boot
- Spring Web
- Spring Data JPA
- Spring Security
- JWT
- PostgreSQL
- Bean Validation
- Swagger / OpenAPI
- Lombok
- Maven
- Docker
- Docker Compose

---

## 🔐 Segurança e autenticação

A aplicação utiliza **JWT (JSON Web Token)** em conjunto com o Spring Security para autenticar usuários e proteger os recursos da API.

O fluxo funciona de forma semelhante a este:

Cliente  
↓  
Requisição HTTP  
↓  
JwtAuthenticationFilter  
↓  
Validação do Bearer Token  
↓  
Spring Security  
↓  
Controller  
↓  
Service  
↓  
Repository  
↓  
PostgreSQL  

Quando uma requisição chega à aplicação, o filtro de autenticação verifica o header:

`Authorization: Bearer TOKEN_JWT`

A partir disso, a aplicação:

1. identifica o Bearer Token;
2. extrai o JWT;
3. valida o token;
4. verifica assinatura e expiração;
5. obtém as informações presentes nas claims;
6. identifica o usuário;
7. cria a autenticação;
8. registra essa autenticação no contexto de segurança do Spring;
9. permite ou bloqueia o acesso ao endpoint solicitado.

Se o token for válido, a requisição pode continuar normalmente.

Se estiver inválido ou expirado, o acesso ao recurso protegido é negado.

---

## 🏗️ Organização do projeto

A aplicação foi estruturada buscando separar as responsabilidades entre as diferentes camadas.

Controller  
↓  
Service  
↓  
Repository  
↓  
Database  

### Controller

Responsável por receber as requisições HTTP e retornar as respostas da API.

### Service

Responsável pelas regras e operações da aplicação.

### Repository

Responsável pela comunicação com o banco de dados através do Spring Data JPA.

### DTOs

Utilizados para transportar dados entre as diferentes partes da aplicação.

### Security

Responsável pela autenticação, validação do JWT e proteção dos endpoints.

### Exceptions

Responsável pelo tratamento centralizado dos erros da aplicação.

---

## ✨ Funcionalidades

Entre os principais conceitos e funcionalidades trabalhados no projeto estão:

- Cadastro de usuários
- Gerenciamento de usuários
- Persistência de dados
- Integração com PostgreSQL
- Spring Data JPA
- DTOs
- Bean Validation
- Tratamento de exceções
- Autenticação com JWT
- Spring Security
- Proteção de endpoints
- Validação de Bearer Token
- Leitura das claims do JWT
- Contexto de autenticação
- Swagger / OpenAPI
- Docker Compose

---

## 🐘 Banco de dados

O projeto utiliza **PostgreSQL** como banco de dados.

O ambiente pode ser executado através do Docker Compose.

`docker compose up -d`

Isso permite subir o banco de dados em container sem necessidade de instalação local do PostgreSQL.

---

## ▶️ Como executar o projeto

### Pré-requisitos

Antes de executar a aplicação, é necessário possuir:

- Java
- Git
- Docker
- Docker Compose

### 1. Clone o repositório

`git clone https://github.com/DaniVasques/api-usuarios-java.git`

### 2. Entre na pasta do projeto

`cd api-usuarios-java`

### 3. Suba o banco de dados

`docker compose up -d`

### 4. Execute a aplicação

No Windows:

`mvnw.cmd spring-boot:run`

No Linux ou macOS:

`./mvnw spring-boot:run`

---

## 📖 Swagger / OpenAPI

A aplicação possui documentação da API utilizando Swagger/OpenAPI.

Com o projeto em execução, a documentação pode ser acessada pelo navegador.

Exemplo:

`http://localhost:8080/swagger-ui/index.html`

> A porta pode variar de acordo com a configuração da aplicação.

O Swagger permite visualizar os endpoints disponíveis e realizar testes diretamente pela interface.

---

## 🔑 Autenticação com JWT

Para acessar endpoints protegidos, o cliente deve enviar o token JWT no header da requisição.

Exemplo:

`Authorization: Bearer eyJhbGciOiJIUzI1NiJ9...`

O token é interceptado pelo filtro de autenticação antes que a requisição chegue ao endpoint protegido.

Request  
↓  
JWT Filter  
↓  
Token válido?  
↓  
Spring Security Context  
↓  
Endpoint protegido  

Essa implementação permite que a API saiba quem está realizando a requisição antes de liberar determinados recursos.

---

## 🧠 Conceitos praticados

Durante o desenvolvimento deste projeto foram trabalhados conceitos como:

- API REST
- Arquitetura em camadas
- Separação de responsabilidades
- Injeção de dependência
- Spring Boot
- Spring Data JPA
- Hibernate
- DTOs
- Bean Validation
- Global Exception Handling
- Spring Security
- JWT
- Bearer Authentication
- Claims
- Security Context
- Proteção de endpoints
- PostgreSQL
- Docker
- Documentação com Swagger

---

## 💡 Segurança também faz parte da arquitetura

Um dos principais aprendizados deste projeto foi perceber que segurança não deve ser tratada como algo separado ou adicionado apenas no final do desenvolvimento.

Uma aplicação não precisa apenas executar corretamente suas regras de negócio.

Ela também precisa saber:

Quem está fazendo a requisição?  
↓  
Esse usuário está autenticado?  
↓  
O token é válido?  
↓  
Esse recurso pode ser acessado?  

Por isso, autenticação e segurança também fazem parte da arquitetura de um sistema.

---

## 🎯 Objetivo do projeto

O principal objetivo deste projeto foi consolidar conhecimentos de **Back-End com Java e Spring Boot**, principalmente relacionados ao desenvolvimento de APIs REST e segurança.

O projeto permitiu praticar o fluxo completo de uma aplicação:

Requisição  
↓  
Segurança  
↓  
Controller  
↓  
Service  
↓  
Repository  
↓  
Banco de dados  

Mais do que desenvolver operações de cadastro, o objetivo foi compreender como as diferentes partes de uma API se relacionam.

---

## 📌 Status do projeto

✅ API REST desenvolvida  
✅ Integração com PostgreSQL  
✅ Spring Data JPA  
✅ Bean Validation  
✅ Tratamento de exceções  
✅ Spring Security  
✅ Autenticação JWT  
✅ Proteção de endpoints  
✅ Swagger / OpenAPI  
✅ Docker Compose  

---

## 👩‍💻 Autora

**Daniela Roballo Vasques**

Desenvolvedora em formação com foco em desenvolvimento **Full Stack e Back-End**, utilizando principalmente Java, Spring Boot, C#, .NET e tecnologias Front-End.

### Links

GitHub  
https://github.com/DaniVasques

LinkedIn  
https://www.linkedin.com/in/daniela-roballo/

Portfólio  
https://danielaroballo.vercel.app/

---

⭐ Projeto desenvolvido para estudo, prática e composição de portfólio.

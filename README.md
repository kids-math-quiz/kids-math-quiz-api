### Projeto kids-math-quiz

# Documentacao e normas do projeto

Decidimos que vamos utilizar SpringBoot para nossa API, com as seguintes inicias configuracoes:

Vamos startar o projeto com spring-boot initializr  
Java como linguagem principal
Nossa configuracao de packpage group: com.kidsmathquiz
Java 17

### Develop Tools

- GraalVM Native Suport
- Lombok

### Estrutura de pastas e organizacao de arquitetura de pastas

Inicialmente decidimos optar por uma estrutura de pastas simples baseado em MVC


```
/src
    ├── Controller
    ├── Services
    ├── Entities
    └── Repository
```

Essa estrutura é comumente usada em projetos de software, especialmente em arquiteturas de aplicativos baseadas em MVC (Model-View-Controller) ou em arquiteturas similares. Cada pasta serve a um propósito específico:

Controller: Contém os controladores da aplicação, que lidam com as requisições do cliente, manipulam os dados e interagem com o serviço apropriado para processamento.

Services: Aqui ficam os serviços da aplicação, que implementam a lógica de negócios e fornecem funcionalidades para os controladores. Eles geralmente coordenam operações entre diferentes partes da aplicação e interagem com as entidades e o repositório.

Entities: Esta pasta normalmente contém as entidades do domínio da aplicação, como objetos que representam conceitos do mundo real (por exemplo, Usuário, Produto, Pedido, etc.). Essas entidades frequentemente correspondem a tabelas em um banco de dados em aplicações que usam um modelo relacional.

Repository: Aqui é onde residem as implementações de acesso a dados, responsáveis por interagir com o banco de dados ou qualquer outro mecanismo de persistência. Eles fornecem métodos para criar, ler, atualizar e excluir (CRUD) entidades no banco de dados, abstraindo os detalhes de armazenamento e recuperando dados para os serviços e controladores.


DIAGRAMA GIT FLOW DO PROJETO
![Linha do tempo](https://github.com/kids-math-quiz/kids-math-quiz-api/assets/44899195/af844cbf-5037-4dcc-b4b2-6f38eea48523)


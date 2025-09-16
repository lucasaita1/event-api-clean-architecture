# Event API - Clean Architecture

API de eventos desenvolvida em Java com Spring Boot, seguindo os princípios da Clean Architecture para garantir um código robusto, escalável e de fácil manutenção. Este projeto foca na separação clara de responsabilidades e alta testabilidade, proporcionando uma base sólida para o desenvolvimento de microsserviços de eventos.

## Visão Geral do Projeto

Este projeto implementa uma API RESTful para gerenciamento de eventos, utilizando as melhores práticas de desenvolvimento de software, com ênfase na Clean Architecture. A estrutura do projeto é modular, permitindo que cada camada tenha sua responsabilidade bem definida, facilitando a compreensão, a manutenção e a evolução do sistema.

## Tecnologias Utilizadas

*   **Java 17**: Linguagem de programação principal.
*   **Spring Boot 3.2.5**: Framework para construção de aplicações Java robustas e escaláveis.
*   **Spring Data JPA**: Para persistência de dados, abstraindo a interação com o banco de dados.
*   **PostgreSQL**: Banco de dados relacional utilizado para armazenar as informações dos eventos.
*   **Flyway**: Ferramenta de migração de banco de dados para controle de versão do schema.
*   **Lombok**: Biblioteca para reduzir o código boilerplate em classes Java.
*   **Docker & Docker Compose**: Para orquestração e execução dos serviços em contêineres.

## Arquitetura

O projeto segue a **Clean Architecture**, organizada em camadas concêntricas para desacoplar as regras de negócio da infraestrutura. As principais camadas são:

*   **Core (Domínio)**: Contém as entidades de negócio, interfaces de gateway e casos de uso (use cases). É a camada mais interna e independente, onde as regras de negócio são definidas.
    *   `entities`: Definição das entidades de domínio (ex: `Event`).
    *   `gateway`: Interfaces que definem os contratos para interação com o mundo externo (ex: `EventGateway`).
    *   `usecases`: Classes que implementam a lógica de negócio específica, orquestrando as entidades e gateways para realizar operações (ex: `CreateEventCase`, `ListEventCase`).
*   **Infra (Infraestrutura)**: Responsável pela implementação dos detalhes técnicos, como persistência de dados, controladores REST e configurações de beans do Spring.
    *   `beans`: Configurações de injeção de dependência.
    *   `controller`: Controladores REST que expõem os endpoints da API.
    *   `dto`: Objetos de Transferência de Dados para comunicação entre as camadas e com o cliente.
    *   `exceptions`: Classes de exceção personalizadas.
    *   `gateway`: Implementações das interfaces de gateway definidas na camada Core, interagindo com o banco de dados ou outros serviços externos.
    *   `mapper`: Classes para mapeamento entre DTOs, entidades de domínio e entidades de persistência.
    *   `persistence`: Repositórios JPA para acesso ao banco de dados.

## Como Executar o Projeto

### Pré-requisitos

Certifique-se de ter as seguintes ferramentas instaladas em sua máquina:

*   Java Development Kit (JDK) 17 ou superior
*   Maven 3.x
*   Docker e Docker Compose

### Passos para Execução

1.  **Clone o repositório:**

    ```bash
    git clone https://github.com/lucasaita1/event-api-clean-architecture.git
    cd event-api-clean-architecture
    ```

2.  **Inicie o banco de dados PostgreSQL com Docker Compose:**

    ```bash
    docker-compose up -d postgres
    ```

3.  **Execute as migrações do Flyway (opcional, mas recomendado para garantir o schema):**

    ```bash
    mvn flyway:migrate
    ```

4.  **Inicie a aplicação Spring Boot:**

    ```bash
    mvn spring-boot:run
    ```

    A API estará disponível em `http://localhost:8080`.


## Próximos Passos: Deploy na AWS

Em breve, este projeto será implantado na Amazon Web Services (AWS), aproveitando a escalabilidade, segurança e robustez da plataforma. O deploy incluirá a conteinerização da aplicação utilizando Docker e a orquestração com serviços como Amazon ECS ou EKS, além do uso de Amazon RDS para o banco de dados PostgreSQL e outras ferramentas da AWS para monitoramento e gerenciamento. Mais detalhes sobre o processo de deploy serão adicionados em breve.


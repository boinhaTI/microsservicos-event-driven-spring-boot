# Microsserviços Event-Driven com Spring Boot e RabbitMQ

Sistema de microsserviços desenvolvido com **Spring Boot**, **RabbitMQ** e **PostgreSQL**, seguindo o padrão **Event-Driven Architecture**, com comunicação assíncrona entre serviços.

Este projeto foi desenvolvido com foco em **boas práticas**, **desacoplamento**, **mensageria** e **arquitetura distribuída**, servindo como estudo e portfólio backend.

---

## 🧠 Arquitetura

O sistema é composto por dois microsserviços principais:

### 🔹 User Service
- Responsável pelo cadastro de usuários
- Persiste dados no PostgreSQL
- Publica eventos no RabbitMQ após o cadastro

### 🔹 Email Service
- Consome eventos do RabbitMQ
- Simula o envio de e-mails a partir dos dados recebidos

📌 Comunicação **assíncrona** via fila RabbitMQ.

---

## 🛠️ Tecnologias Utilizadas

- Java 17+
- Spring Boot
- Spring Data JPA
- Spring AMQP (RabbitMQ)
- PostgreSQL
- Docker & Docker Compose
- Maven
- Git & GitHub

---

## 📦 Mensageria (RabbitMQ)

- Exchange: `default`
- Queue: `default.email`
- Padrão: **Producer / Consumer**
- Serialização: JSON (Jackson)

---

## 🗂️ Estrutura dos Microsserviços

```text
user-service
 ├── controller
 ├── service
 ├── repository
 ├── dtos
 ├── mapper
 └── producers

email-service
 ├── consumer
 ├── service
 ├── dtos
 └── configs
```
---

## 🚀 Como executar o projeto

➡️ O passo a passo completo está no arquivo
📄 README-SETUP.md

---

## 📌 Boas práticas aplicadas

DTOs para entrada e saída

Mapper para conversão DTO ↔ Entity

Transações com @Transactional

Comunicação desacoplada via eventos

Separação de responsabilidades

Properties sensíveis fora do GitHub

---

## 👨‍💻 Autor

Desenvolvido por Cristofer Dantas

📌 Estudante de Ciência da Computação

📌 Backend Java | Spring Boot

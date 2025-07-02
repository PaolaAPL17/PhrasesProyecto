# My first API with Spring Boot

_CRUD API for Inspirational, Funny, and Lorem Ipsum Quotes 📚
This project is a REST API built with Spring Boot that allows users to create, read, update, and delete quotes. Each quote contains text and an author, and all quotes are stored in a MySQL database._

### Technologies Used 🚀
* **Java 21**
* **Spring Boot**
* **Spring Data JPA**
* **MySQL**
* **Postman**
* **GitHub**
* **Trello**

### Features (CRUD)🎯
* **Create a new quote** ✅
* **List all quotes** ✅
* **Get a quote by ID** ✅
* **Update an existing quote** ✅
* **Delete a quote by ID** ✅

### Setup and Run 🛠️
* **Clone the repository**
* **Create a MySQL database**
* **Configure application.properties (in src/main/resources)**
* **Run the app using IntelliJ or via terminal**

### Testing with Postman 🔬
* **GET /frases → Get all quotes**
* **GET /frases/{id} → Get quote by ID**
* **POST /frases → Create a new quote**
* **PUT /frases/{id} → Update a quote**
* **DELETE /frases/{id} → Delete a quote**

### Folder Structure 📁

```bash
src/
└── main/
  ├── java/
  │  └── phrase.phrase/
  │    ├── controllers/
  │    ├── models/
  │    ├── repositories/
  │    └── services/
  └── resources/
    └── application.properties
```
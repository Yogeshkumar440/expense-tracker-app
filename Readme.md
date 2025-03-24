# Expense Management REST API

## Overview
The **Expense Management REST API** is a Spring Boot-based backend application that provides CRUD operations for managing expenses and categories. It is designed to allow users to create, read, update, and delete expenses and categories efficiently. The API is documented using **Swagger** for easy exploration and testing.

## Features
- **Category Management:** Create, retrieve, update, and delete expense categories.
- **Expense Management:** Create, retrieve, update, and delete expenses.
- **Swagger Documentation:** API documentation for easy testing.
- **Spring Boot & RESTful Architecture:** Efficient and scalable backend.

## Technologies Used
- **Spring Boot** - Backend framework
- **Spring Data JPA** - ORM for database interaction
- **Spring Web** - REST API development
- **MySQL** - Database for storing expenses and categories
- **Swagger (Springdoc OpenAPI)** - API documentation
- **Lombok** - Reduces boilerplate code

## Installation and Setup

### Prerequisites
Ensure you have the following installed:
- Java 17 or later
- Maven
- MySQL 

### Clone the Repository
```sh
git clone https://github.com/yogeshkumar440/expense-tracker-app.git
cd expense-tracker-app
```

### Configure Database
Update `application.properties` or `application.yml` with your database credentials.

**Example (MySQL Configuration in `application.properties`):**
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/expense_db
spring.datasource.username=root
spring.datasource.password=password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

### Build and Run the Application
Use the following commands to build and run the application:
```sh
mvn clean install
mvn spring-boot:run
```

### API Endpoints
| Endpoint | Method | Description |
|----------|--------|-------------|
| `/api/categories` | `POST` | Create a new category |
| `/api/categories/{id}` | `GET` | Get category by ID |
| `/api/categories` | `GET` | Get all categories |
| `/api/categories/{id}` | `PUT` | Update category |
| `/api/categories/{id}` | `DELETE` | Delete category |
| `/api/expenses` | `POST` | Create a new expense |
| `/api/expenses/{id}` | `GET` | Get expense by ID |
| `/api/expenses` | `GET` | Get all expenses |
| `/api/expenses/{id}` | `PUT` | Update expense |
| `/api/expenses/{id}` | `DELETE` | Delete expense |

### API Documentation
Once the application is running, you can access the **Swagger API documentation** at:
```
http://localhost:8080/swagger-ui/index.html
```

## Contributing
1. Fork the repository.
2. Create a new branch (`git checkout -b feature-branch`).
3. Commit your changes (`git commit -m 'Add new feature'`).
4. Push to the branch (`git push origin feature-branch`).
5. Open a pull request.


## Contact
For any queries or suggestions, feel free to reach out:
- **Email:** yogesh.galgotias@gmail.com
- **GitHub:** [YogeshKumar440](https://github.com/yogeshkumar440)
- **LinkedIn:** [YogeshKumar440](https://linkedin.com/in/yogeshkumar440)

---
Happy coding! 🚀


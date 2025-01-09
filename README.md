# Todo Management - Secure REST API with Spring Boot

## 📋 Project Overview
The **Todo Management** project demonstrates how to build secure, real-time REST APIs using **Spring Boot**, **Spring Security**, and **JWT (JSON Web Tokens)**. This project provides a backend service to manage todos with features like user authentication, authorization, and CRUD operations.

## 🛠️ Tech Stack
- **Spring Boot**: For building REST APIs
- **Spring Security**: For securing APIs
- **JWT (JSON Web Token)**: For user authentication and session management
- **Maven**: For dependency management
- **H2 Database**: In-memory database for quick setup

## ✨ Features
- Secure REST API endpoints
- User authentication with JWT
- Role-based access control (Admin/User)
- CRUD operations for managing todos

## 📚 Learning Outcomes
- Building RESTful APIs with Spring Boot
- Implementing security with Spring Security and JWT
- Understanding role-based access control
- Handling user authentication and authorization

## 🚀 Getting Started
### Prerequisites
- Java 17+
- Maven

### Installation Steps
1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/todo-management.git
   ```
2. Navigate to the project directory:
   ```bash
   cd todo-management
   ```
3. Build the project:
   ```bash
   mvn clean install
   ```
4. Run the application:
   ```bash
   mvn spring-boot:run
   ```

## 📋 API Endpoints
| Method | Endpoint          | Description          |
|--------|-------------------|----------------------|
| POST   | /api/auth/signup   | Register a new user  |
| POST   | /api/auth/login    | User login with JWT  |
| GET    | /api/todos         | Get all todos        |
| POST   | /api/todos         | Create a new todo    |
| PUT    | /api/todos/{id}    | Update a todo by ID  |
| DELETE | /api/todos/{id}    | Delete a todo by ID  |

## 🔐 Security
This project uses **Spring Security** and **JWT** to secure API endpoints:
- **JWT** is used for stateless authentication.
- Users must log in to receive a token, which is required to access protected endpoints.

## 📄 License
This project is licensed under the MIT License.

---

💻 **Happy Coding!**


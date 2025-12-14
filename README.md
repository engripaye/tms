# 📝 Task Manager Application (React + Spring Boot)

A full-stack **Task Management System** built with **React** and **Spring Boot**, featuring **JWT-based authentication**, secure APIs, and a clean, scalable architecture.

This project demonstrates real-world backend security, REST API design, and frontend integration — suitable for portfolios and technical interviews.

---

## 🚀 Project Overview

The Task Manager allows users to:

* Register and authenticate securely
* Create, update, and delete tasks
* Track task progress using statuses
* Organize tasks with priorities and due dates
* Access protected resources using JWT authentication

---

## 🎯 Key Objectives

* Build a **secure, production-style backend**
* Implement **JWT authentication & authorization**
* Create a **clean RESTful API**
* Develop a **modern React frontend**
* Demonstrate best practices in **Spring Boot + React**

---

## 🛠 Tech Stack

### Backend

* **Java 21**
* **Spring Boot 3.5**
* Spring Security (JWT)
* Spring Data JPA (Hibernate)
* MySQL
* Lombok

### Frontend

* **React**
* Axios
* React Router
* Modern component-based architecture

---

## ✨ Features

### Phase 1 – Core (MVP)

* User Registration
* User Login (JWT Authentication)
* Create Task
* Update Task
* Delete Task
* View All Tasks

### Phase 2 – Professional Enhancements

* Task Priority
* Due Date
* Filter Tasks by Status
* Protected Frontend Routes
* Cleaner UI & UX

---

## 🗂 Project Structure

### Backend (Spring Boot)

```
task-manager-backend
 └── src/main/java/com/example/taskmanager
     ├── config
     ├── controller
     ├── dto
     ├── entity
     ├── repository
     ├── security
     ├── service
     └── TaskManagerApplication.java
```

### Frontend (React)

```
task-manager-frontend
 └── src
     ├── api
     ├── components
     ├── pages
     ├── routes
     └── App.jsx
```

---

## 🔐 Authentication & Security

* JWT-based authentication
* Password encryption using BCrypt
* Stateless session management
* Protected API endpoints
* Frontend route protection

---

## 🗺 Development Roadmap

### ✅ Step 1 – Backend Setup

* Create Spring Boot project
* Configure MySQL
* Create `User` entity
* Run and verify application

### Step 2 – Authentication

* User registration
* User login
* JWT generation & validation

### Step 3 – Task API

* Task entity
* CRUD operations
* User-task relationship

### Step 4 – Frontend Setup

* React project structure
* Pages & components
* Routing

### Step 5 – Integration

* Connect frontend to backend
* Secure API calls with JWT
* End-to-end testing

---

## ⚙️ Backend Setup Instructions

### 1️⃣ Create Database

```sql
CREATE DATABASE task_manager;
```

### 2️⃣ Configure `application.yml`

```yaml
spring:
  datasource:
    url: jdbc:mysql://localhost:3306/task_manager
    username: root
    password: your_password

  jpa:
    hibernate:
      ddl-auto: update
    show-sql: true
```

### 3️⃣ Run Backend

```bash
./mvnw spring-boot:run
```

Backend will start at:

```
http://localhost:8080
```

---

## 🧩 Sample User Entity

```java
@Entity
@Table(name = "users")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String username;

    private String password;

    private String role;
}
```

---

## 📌 API Endpoints (Planned)

| Method | Endpoint             | Description       |
| ------ | -------------------- | ----------------- |
| POST   | `/api/auth/register` | Register new user |
| POST   | `/api/auth/login`    | Authenticate user |
| GET    | `/api/tasks`         | Get user tasks    |
| POST   | `/api/tasks`         | Create task       |
| PUT    | `/api/tasks/{id}`    | Update task       |
| DELETE | `/api/tasks/{id}`    | Delete task       |

---

## 🧪 Testing Tools

* Postman
* Browser DevTools
* MySQL Workbench

---

## 📦 Future Improvements

* Pagination & sorting
* Task reminders
* Role-based access control
* Dockerization
* Deployment (Render / Railway / AWS)

---

## 👨‍💻 Author

**Ipaye Tunde**
Backend / Full-Stack Developer
Java • Spring Boot • React • REST APIs

---

## ⭐ Why This Project?

This project demonstrates:

* Real-world backend security
* Clean architecture & separation of concerns
* Practical React + Spring Boot integration
* Interview-ready design decisions

---

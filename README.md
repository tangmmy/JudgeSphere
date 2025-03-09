# JudgeSphere

JudgeSphere is an online judge system built with **Spring Boot**. It allows users to submit and evaluate code, similar to platforms like LeetCode and Codeforces.

## 🚀 Features
- **User Management** (Registration, Authentication, Roles)
- **Code Submission & Execution**
- **Problem Management**
- **Admin Panel for Problem Moderation**
- **RESTful API with Swagger Documentation**
- **Asynchronous Processing for Code Execution**

---


## 📌 Modules & Progress

| Module                 | Status      |
|------------------------|------------|
| **User Management**    | ✅ Done    |
| Authentication (JWT)   | ✅ Done    |
| Code Execution Engine  | ⏳ In Progress |
| Problem Management     | ⏳ In Progress |
| API Documentation (Swagger) | ✅ Done |

---

## 🛠️ Tech Stack
- **Backend:** Spring Boot, Java
- **Database:** h2
- **Security:** Spring Security, JWT
- **Async Processing:** `@Async`, CompletableFuture
- **API Documentation:** Swagger (SpringDoc OpenAPI)
- **Deployment:** AWS EC2, Ubuntu, Nginx, PM2 (for process management)

---

## 📖 API Documentation (Swagger)
Once the server is running, access Swagger UI at:
```
http://<your-ec2-ip>:8080/swagger-ui/index.html
```

---

## 🏃‍♂️ Running Locally
### **Prerequisites**
- Java 17+
- Maven
- PostgreSQL

### **Steps to Run**
```sh
git clone https://github.com/tangmmy/judgesphere.git
cd judgesphere
mvn clean install
mvn spring-boot:run
```

Server will start at **`http://localhost:8080`**

## 📜 License
MIT License
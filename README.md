# Simple Quiz App

Backend service for a basic quiz application built with **Spring Boot**.  
This project provides REST APIs to manage quizzes and questions using **Java** and **Maven**.

---

## Overview

- **Language:** Java  
- **Framework:** Spring Boot  
- **Build Tool:** Maven  
- **Purpose:** Provide backend logic for quiz functionality  

---

## Features

- Serve quiz questions and answers via REST endpoints  
- Support basic quiz operations  
- Modular Java structure suitable for enhancement  

---

## 📁 Project Structure

```
Simple_Quize_App/                     # Root project directory
│
├── src/                              # Application source code
│   ├── main/
│   │   ├── java/                     # Java implementation
│   │   │   └── com/
│   │   │       └── quizapp/          # Base package
│   │   │           ├── controller/   # REST endpoints (HTTP request handling)
│   │   │           ├── service/      # Business logic & application rules
│   │   │           ├── repository/   # Database access (JPA interfaces)
│   │   │           ├── model/        # Entities, DTOs, and domain models
│   │   │           └── QuizApplication.java   # Spring Boot bootstrap class
│   │   │
│   │   └── resources/                # Configuration & static assets
│   │       ├── application.properties # App config (DB, port, JPA, etc.)
│   │       └── static/               # Static files (HTML, CSS, JS if used)
│
├── pom.xml                           # Maven dependencies & build config
├── mvnw                              # Maven wrapper (Linux/macOS)
└── mvnw.cmd                          # Maven wrapper (Windows)
```

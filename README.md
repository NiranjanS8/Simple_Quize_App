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

## Project Structure
Simple_Quize_App/
│
├── src/ # Source code folder
│ ├── main/
│ │ ├── java/ # Java source files
│ │ │ └── com/
│ │ │ └── quizapp/ # Base package
│ │ │ ├── controller/ # REST controllers (handles HTTP requests)
│ │ │ ├── service/ # Business logic layer
│ │ │ ├── repository/ # Data access layer (DB interaction)
│ │ │ ├── model/ # Entity and data models
│ │ │ └── QuizApplication.java # Main Spring Boot entry point
│ │ └── resources/ # Configuration and static files
│ │ ├── application.properties # App configuration (DB, port, etc.)
│ │ └── static/ # Static resources (if any)
│
├── pom.xml # Maven dependencies and build configuration
├── mvnw # Maven wrapper (Linux/Mac)
└── mvnw.cmd # Maven wrapper (Windows)


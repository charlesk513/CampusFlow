# CampusFlow

> A Java-based desktop campus management system demonstrating OOP, Java Swing, event-driven programming, file handling, validation, and layered architecture.

## Overview

**CampusFlow** is a portfolio-grade desktop application for managing common university activities from one system.

## Features

- User authentication and login
- Student management
- Course management
- Course registration
- Academic results and grade calculation
- Student payment tracking
- Report generation
- Search and filtering
- Input validation
- File-based data persistence
- Java event handling
- Modular layered architecture

## Technologies

- Java
- Java Swing
- Java AWT Event Handling
- Object-Oriented Programming
- File I/O
- Collections Framework
- Layered Architecture
- JDBC/MySQL — planned

## Architecture

```text
                 CAMPUSFLOW
                     |
          +----------+----------+
          |                     |
         UI                  BUSINESS
      Java Swing               LOGIC
          |                     |
          +----------+----------+
                     |
                Service Layer
                     |
              Repository Layer
                     |
                FileManager
                     |
                 Data Files
```

## Project Structure

```text
CampusFlow/
|
+-- src/
|   +-- campusflow/
|       +-- model/
|       |   +-- User.java
|       |   +-- Student.java
|       |   +-- Course.java
|       |   +-- Registration.java
|       |   +-- Result.java
|       |   +-- Payment.java
|       |   +-- Lecturer.java
|       |
|       +-- ui/
|       |   +-- LoginFrame.java
|       |   +-- DashboardFrame.java
|       |   +-- StudentPanel.java
|       |   +-- CoursePanel.java
|       |   +-- RegistrationPanel.java
|       |   +-- ResultsPanel.java
|       |   +-- PaymentPanel.java
|       |   +-- ReportsPanel.java
|       |
|       +-- service/
|       |   +-- AuthService.java
|       |   +-- StudentService.java
|       |   +-- CourseService.java
|       |   +-- RegistrationService.java
|       |   +-- ResultService.java
|       |   +-- PaymentService.java
|       |
|       +-- repository/
|       |   +-- UserRepository.java
|       |   +-- StudentRepository.java
|       |   +-- CourseRepository.java
|       |   +-- RegistrationRepository.java
|       |   +-- ResultRepository.java
|       |   +-- PaymentRepository.java
|       |
|       +-- util/
|           +-- FileManager.java
|           +-- Validator.java
|           +-- IDGenerator.java
|           +-- ReportGenerator.java
|
+-- data/
+-- README.md
+-- LICENSE
```

## Event Handling

CampusFlow uses Java event-driven programming, including:

```text
ActionListener
MouseListener
KeyListener
ItemListener
DocumentListener
```

Example:

```text
User clicks "Add Student"
        |
   ActionListener
        |
   Read form data
        |
   StudentService
        |
   Validate student
        |
   StudentRepository
        |
   FileManager
        |
   students.txt
        |
   Refresh JTable
```

## Data Persistence

The initial version uses file-based storage:

```text
data/
+-- users.txt
+-- students.txt
+-- courses.txt
+-- registrations.txt
+-- results.txt
+-- payments.txt
```

The repository layer is designed so that file storage can later be replaced with MySQL.

### Planned Database Upgrade

```text
Java Swing
     |
  Services
     |
Repositories
     |
    JDBC
     |
   MySQL
```

## Getting Started

### Requirements

- Java JDK 17 or later
- NetBeans IDE or another Java IDE
- Git

### Clone

```bash
git clone https://github.com/YOUR-USERNAME/CampusFlow.git
cd CampusFlow
```

### Run

Open the project in NetBeans or your preferred Java IDE and run `Main.java`.

## Development Roadmap

```text
Project Foundation
       |
Login & Authentication
       |
Dashboard
       |
Student Management
       |
Course Management
       |
Course Registration
       |
Results Management
       |
Payment Management
       |
File Handling
       |
Reports
       |
Testing & Refinement
       |
JDBC / MySQL
```

## Future Improvements

- MySQL database integration
- JDBC persistence
- Role-based access control
- Dashboard analytics
- PDF report generation
- Advanced search and filtering
- Data backup and restoration
- Improved UI/UX
- Application logging
- Automated testing

## Project Purpose

CampusFlow is a learning and portfolio project designed to demonstrate the ability to build a relatively complex Java application from interface design through business logic and data persistence.

The project emphasizes:

> **What each class is responsible for, why it exists, and how it communicates with other classes.**

## License

This project is available for educational and portfolio purposes.

---

**CampusFlow — Learn. Manage. Connect.**

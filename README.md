
# Student Management System

A Java desktop application for managing student records using Java Swing, JDBC, and MySQL.

## Features

- Add new student records
- View all students in a graphical table
- Search students by ID
- Update student details
- Delete student records with confirmation
- Input validation for student data
- Persistent storage using MySQL
- Graphical interface built with Java Swing

## Tech Stack

- **Language:** Java
- **GUI:** Java Swing
- **Database:** MySQL
- **Database Connectivity:** JDBC
- **IDE:** IntelliJ IDEA
- **Version Control:** Git and GitHub

## Project Structure

```text
Student-Management-System/
├── src/
│   ├── Main.java
│   ├── Student.java
│   ├── StudentDAO.java
│   ├── DBConnection.java
│   └── StudentDAOTest.java
├── .gitignore
└── README.md
```

## Database Setup

1. Install MySQL Server and start the service.
2. Create the database and table:

```sql
CREATE DATABASE student_management;
USE student_management;

CREATE TABLE students (
    id INT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    age INT NOT NULL,
    course VARCHAR(100) NOT NULL,
    marks DOUBLE NOT NULL
);
```

3. Add MySQL Connector/J to the project dependencies.
4. Configure your database URL, username, and password in `DBConnection.java`.
5. Run `Main.java` to launch the application.

**Security:** Never commit real database passwords or other secrets to GitHub.

## How to Use

1. Launch the application.
2. Enter the student details in the form.
3. Use Add, Update, Delete, Search, and Refresh to manage records.
4. Select a row to load the student's details into the form.

## Concepts Demonstrated

- Object-Oriented Programming
- CRUD operations
- JDBC and prepared statements
- SQL database integration
- Java Swing event handling
- Input validation
- Git version control

## Future Improvements

- Automated unit and integration tests
- Improved database configuration
- Migration to a Spring Boot REST API

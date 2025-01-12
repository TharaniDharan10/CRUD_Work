Overview:
This is a Spring Boot application developed using IntelliJ IDEA. It demonstrates the use of essential dependencies for building a robust web application with database integration, validation, and backend services.


Features:
Database Integration: Connects with MySQL using JPA for seamless data management.
Input/Output Validation: Ensures data integrity with Spring Boot validation.
RESTful APIs: Built with Spring Web for handling HTTP requests and responses.
Simplified Coding: Utilizes Lombok to reduce boilerplate code.
Development Environment: Developed in IntelliJ Community for an efficient and productive experience.


Dependencies:
The project includes the following key dependencies:

Spring Data JPA:
Provides a repository-based abstraction for data access.
Simplifies CRUD operations and query generation.

Lombok:
Reduces boilerplate code by generating getters, setters, constructors, and more at compile time.

MySQL:
Serves as the relational database for data storage and management.

Spring Web:
Facilitates the development of RESTful web services.
Supports handling HTTP requests and responses.

Spring Boot Validation:
Ensures proper validation of user input with annotations.

Endpoints:

POST /api/students - Add a new student.

GET /api/students - Retrieve all students.

GET /api/students/{id} - Retrieve a specific student by ID.

PUT /api/students/{id} - Update an existing student's details.

DELETE /api/students/{id} - Delete a student by ID.


Setup and Installation:

Clone the repository:
git clone <repository-url>
cd <repository-directory>

Open the project in Intellij.

Add your MySQL database configuration in application.properties:
spring.datasource.url=jdbc:mysql://localhost:3306/yourdatabase
spring.datasource.username=yourusername
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update

Build the project and resolve dependencies:
mvn clean install

Run the application:
mvn spring-boot:run

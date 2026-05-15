# User Management Application

You open a client and create or manage a user. This small monolithic service demonstrates a clear REST API and layered implementation using Spring Boot.

Services Overview
Service	Port	Responsibility
user-service	8080	Provide REST endpoints for user CRUD (Controller → Service → Repository)

Architecture Flow
Client → user-service (Spring Boot Controller) → Service layer → Spring Data JPA Repository → PostgreSQL

How To Run
Step 1: Start infrastructure
docker-compose up -d

Step 2: Wait ~10s for the database to initialize.

Step 3: Start the service (local dev)
cd .
./mvnw spring-boot:run

API Examples (end-to-end)
1) Create user
POST http://localhost:8080/api/users
{
	"name": "Alice",
	"email": "alice@example.com"
}

2) Get user
GET http://localhost:8080/api/users/{id}

3) Update user
PUT http://localhost:8080/api/users/{id}
{
	"name": "Alice B",
	"email": "alice.b@example.com"
}

4) Delete user
DELETE http://localhost:8080/api/users/{id}

Testing End-to-End
1) Run the app with Docker Compose / local DB.
2) Use `curl` or Postman to exercise the API endpoints above.

Key Concepts Covered
- RESTful API design
- Layered architecture (Controller-Service-Repository)
- Spring Data JPA with PostgreSQL
- Docker Compose for local infra

Made with simplicity for demonstration.

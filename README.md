# User Management Application

A small Spring Boot application demonstrating user CRUD operations and a minimal service/repository layer. This repository is structured and documented for inclusion in a professional portfolio or resume.

## Highlights

- Language: Java
- Framework: Spring Boot
- Build: Maven (wrapper included)
- Database: PostgreSQL (example docker-compose included)

## Features

- Create, read, update, delete (CRUD) users
- Layered architecture: Controller → Service → Repository
- Example Docker Compose for easy local demo

## Tech / Tools

- Java 17+
- Spring Boot
- Maven (mvnw included)
- PostgreSQL
- Docker (optional)

## Quick Start (developer)

1. Copy the example env file and set real values (do not commit):

```bash
cp .env.example .env
# edit .env to set secure passwords/URLs
```

2. Run with Maven wrapper:

```bash
./mvnw clean package
./mvnw spring-boot:run
```

3. Or run with Docker Compose (uses `.env`):

```bash
docker-compose up --build
```

The application listens on the port defined by `SERVER_PORT` or 8080 by default.

## Project Structure

- `src/main/java` — application source (controllers, services, entities, repositories)
- `src/test/java` — unit/integration tests
- `pom.xml` — Maven project definition
- `mvnw`, `mvnw.cmd`, `.mvn/` — Maven wrapper for consistent builds
- `docker-compose.yml` — optional compose for DB + app
- `src/main/resources/application.yml.example` — config template (do not commit real secrets)

## How this fits a resume

- Clean, small codebase showcasing layered design and REST endpoints.
- Includes build scripts and an example Docker setup for reproducible demos.
- Tests included to demonstrate basic verification practices.

## Contributing / Notes

- Do not commit real credentials — use `.env` locally and keep it in `.gitignore`.
- If you want CI, I can add a GitHub Actions workflow to run `mvn test` on PRs.

## License

This project is open for inclusion in a personal portfolio. Add a `LICENSE` file if you want an explicit license.

---
If you want, I'll commit this README and add a short GitHub Actions CI next (runs `mvn test`).

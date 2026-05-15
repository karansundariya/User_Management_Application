# User Management Application

Short setup and run instructions:

1) Prepare local env file (do NOT commit): create a `.env` in the project root from `.env.example` and fill real secrets.

2) Build and run with Maven wrapper:

```bash
./mvnw clean package
./mvnw spring-boot:run
```

3) Or run with Docker Compose (reads `.env`):

```bash
docker-compose -f docker-compose.yml up --build
```

4) Git sequence (push in incremental steps as planned):

```bash
echo "# User_Management_Application" >> README.md
git init
git add README.md
git commit -m "first commit"
git branch -M main
git remote add origin https://github.com/karansundariya/User_Management_Application.git
git push -u origin main
# Step 1: add build metadata
git add mvnw mvnw.cmd .mvn/ pom.xml .gitignore .gitattributes
git commit -m "chore: add build metadata and Maven wrapper"
git push origin main
# Step 2: add source (no secrets)
git add src/main/java src/test
git commit -m "feat: add application source and tests"
git push origin main
# Step 3: add sanitized config examples and README
# create files: src/main/resources/application.yml.example, docker-compose.yml.example, .env.example
# update .gitignore to include src/main/resources/application.yml and .env
git add src/main/resources/application.yml.example docker-compose.yml.example .env.example README.md .gitignore
git commit -m "chore: add sanitized config examples and README"
git push origin main
```

Notes:
- Keep the real `src/main/resources/application.yml` and `.env` local and listed in `.gitignore`.
- After you review these drafts, I can either: (A) create these files in the repo for you and stage the commits (you will still need to push), or (B) just provide the files for you to add and commit locally. Reply with `create` to have me write files, or `copy` to copy the drafts yourself.

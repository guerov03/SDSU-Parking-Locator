# Backend (Spring Boot)

Purpose:
- REST API (parking lots, overrides)
- Data mock first; real feed later

Prereqs:
- Java 17+
- Maven (wrapper included)

Scaffold (first time):
- use Spring Initializr
  - Artifact: parking-backend
  - Dependencies: Spring Web
- move project into /backend

Run (dev):
- cd backend
- ./mvnw spring-boot:run

Build (jar):
- ./mvnw clean package
- output: backend/target/*.jar

Planned endpoints (mock):
- GET /api/lots
- GET /api/lots/{id}
- POST /api/admin/overrides  (later, auth)
- DELETE /api/admin/overrides/{id}  (later)

Config:
- src/main/resources/application.properties
- profile: SPRING_PROFILES_ACTIVE=dev

Notes:
- do not commit target/
- do not commit secrets
- use .env.example for samples

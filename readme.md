# FullStack E-Commerce App - SpringBoot & React

Full-stack e-commerce application built with Java 21, Spring Boot 3.2.3, and React.

## Tech Stack

- **Backend:** Java 21, Spring Boot 3.2.3, Spring Data JPA, Spring Security
- **Frontend:** React, Redux, Material UI
- **Database:** MySQL, Redis (via Docker)
- **Build:** Maven

## Features

- Product catalog with filtering and search
- Shopping cart management
- User authentication & authorization
- RESTful API architecture
- Responsive Material UI design

## Getting Started

### Prerequisites
- Java 21
- Node.js
- Docker (for MySQL & Redis)

### Backend Setup
```bash
./mvnw spring-boot:run
```

### Frontend Setup
```bash
cd client
npm install
npm start
```

### Docker (Database)
```bash
docker compose -f docker/docker-compose.yml up
```

## Project Structure

- `src/` - Spring Boot backend
- `client/` - React frontend
- `docker/` - Docker configuration files
- `pom.xml` - Maven project configuration

## License

This project is for educational purposes.

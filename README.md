# CF1400 Explorer

CF1400 Explorer is a Spring Boot + Thymeleaf application for browsing U.S. Customs CF 1400 filings. It includes advanced filtering, exporting, and a clean UI using DataTables and Bootstrap 5.

## 🚀 Features

- Filter filings by **Filing Port** and **Dock Name**
- Export search results to **CSV**, **Excel**, **PDF**, and **Print**
- Responsive UI with **DataTables.js**
- Deployable via **Docker Compose**

---

## 🧰 Tech Stack

- Java 17
- Spring Boot 3
- Thymeleaf
- PostgreSQL 13
- DataTables.js
- Bootstrap 5
- Docker + Docker Compose

---

## 📦 Running the App (with Docker)

### Prerequisites

- Docker Desktop
- Docker Compose

### Instructions

1. Clone the repo:
    ```bash
    git clone https://github.com/your-username/cf1400-explorer.git
    cd cf1400-explorer
    ```

2. Build the Spring Boot JAR:
    ```bash
    ./mvnw clean package -DskipTests
    ```

3. Start the app with Docker Compose:
    ```bash
    docker-compose up --build
    ```

4. Visit the app at [http://localhost:8081](http://localhost:8081)

---

## 🗃️ Database

The app uses a PostgreSQL container. Schema is auto-created on startup using JPA. You can later migrate local data into the containerized database (see below).

---

## 📂 Project Structure


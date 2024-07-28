# Portfolio Manager

The Automated Portfolio Manager is a sophisticated financial application designed to help users manage their investment portfolios more efficiently and effectively. By integrating with Robinhood's API, this application leverages real-time market data to simulate trading strategies based on predefined conditions, providing users with insights and data-driven decision-making capabilities without the risk of real financial transactions. The application employs advanced security measures using Spring Security and OAuth2 for secure authentication and authorization, ensuring the protection of user data and privacy.

## Prerequisites

- Java 17
- PostgreSQL
- Maven
- Node.js (for the frontend)
- Git

## Environment Variables

Before running the application, set the following environment variables:

```
export GOOGLE_CLIENT_ID=<your-google-client-id>
export GOOGLE_CLIENT_SECRET=<your-google-client-secret>
export POSTGRE_USERNAME=<your-postgresql-username>
export POSTGRE_PASSWORD=<your-postgresql-password>
```

Setting Up the Project
Clone the Repository
```
git clone <repository-url>
cd portfolio-manager
```

Backend Setup
Ensure PostgreSQL is running and create a database:
```
createdb portfolio_manager
```

Update the src/main/resources/application.yml file with your database details:
```
spring:
  datasource:
    url: jdbc:postgresql://localhost:5432/portfolio_manager
    username: ${POSTGRE_USERNAME}
    password: ${POSTGRE_PASSWORD}
  jpa:
    hibernate:
      ddl-auto: update
    properties:
      hibernate:
        dialect: org.hibernate.dialect.PostgreSQLDialect
```

Build and run the backend:
```
./mvnw clean install
./mvnw spring-boot:run
Frontend Setup
Navigate to the frontend directory:
cd frontend
```

Install dependencies:
```
npm install
```

Build the React application:
```
npm run build

Copy the build files to the Spring Boot static directory:
cp -r build/* ../src/main/resources/static/
```

Running the Project
```
Ensure that PostgreSQL is running and that the environment variables are set. Then, start the backend as described above. Access the application at http://localhost:8080.
```

API Endpoints
Create a New User
```
curl -X POST http://localhost:8080/api/users -H "Content-Type: application/json" -d '{"username":"newuser", "password":"newpass"}'
```

Project Structure
```
src/main/java: Contains the backend code.
src/main/resources: Contains the configuration files and static resources.
frontend: Contains the frontend React application.
```

Contribution

Feel free to contribute to the project by submitting pull requests. Ensure that your code adheres to the project's coding standards and includes appropriate tests.

License

This project is licensed under the MIT License.

```
Replace `<repository-url>`, `<your-google-client-id>`, `<your-google-client-secret>`, `<your-postgresql-username>`, and `<your-postgresql-password>` with the actual values. This README provides a comprehensive guide for others to set up and run the project on their local machines.
```

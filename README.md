# Quarkus Rest Client Trailing Slash

Example repo to demonstrate that the Quarkus Rest Client removes the trailing slash from the remote service path.

## How to run

### Docker

```bash
cd quarkus-app
mvn clean package
cd ..
docker compose up
```

### Without Docker

Terminal 1:

```bash
cd remote-service
npm ci
npm start
```

Terminal 2:

```bash
cd quarkus-app
mvn quarkus:dev
```

## Accessing the application

Go to http://localhost:8080/hello to call the Quarkus endpoint

The remote service that Quarkus calls is at http://localhost:3000/endpoint-with-trailing-slash/


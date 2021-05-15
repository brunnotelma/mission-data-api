# Mission Data API

A Restful API to provide data for the Mission App.

### What needs to be done?

### How to use?

First, run the database using Docker. For this, you will need Docker and docker-compose installed in your machine.

```shell
docker-compose up -d
```

This will execute the MySQL database in a Docker container. It will run on port 3306, and Adminer will run on port 8080.

Run the following command in the root folder to build this project:
```shell
./gradlew build
```

Then, run the following command to execute the project:
```shell
./gradlew bootRun
```

The Spring Boot App will run on port 9090. To test it, run the following command:

```shell
curl --location --request GET 'http://localhost:9090/api/users'
```

### How to contribute?

Please read the guide to contributing, [CONTRIBUTING.md](./CONTRIBUTING.md), in this repository.

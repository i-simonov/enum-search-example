# EnumSearchExample

This is a Spring Boot application that uses an enum to map phrases to responses and returns the appropriate response for a given input phrase.

## Overview

The application consists of the following main components:

1. `AnswersService`: This is an enum that maps input phrases to responses. It provides a static method `Answer` that takes an input phrase and returns the appropriate response.

2. `Controller`: This is a Spring REST controller that provides an endpoint to get a response for a given input phrase.

3. `EnumSearchExampleApplication`: This is the main application class that starts the Spring Boot application.

4. `ControllerIntTest`: This is a Spring MVC test for the `Controller` class.

## Installation

1. Make sure you have Java 8 or higher installed on your machine.

2. Clone the repository:
   ```
   git clone https://github.com/your-username/enum-search-example.git
   ```
3. Navigate to the project directory and build the project:
   ```
   cd enum-search-example
   mvn clean install
   ```
4. Run the application:
   ```
   mvn spring-boot:run
   ```
   The application will start and listen on port 8080.

## Usage

The application provides one endpoint:

1. `GET /api/v1/enum-search/{param}`: Returns the response mapped to the given input phrase.
   ```
   curl http://localhost:8080/api/v1/enum-search/hi
   ```
   The response will be "Hello".

## Running the Tests

To run the tests, execute the following command:
```
mvn test
```

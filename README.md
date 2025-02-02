# Notes
---

## What Is Spring Boot?
Spring Boot is the modern development approach for building enterprise application. Spring Boot minimizes the configuration required for setting up Spring projects. By using Spring Boot, you can accelerate your development speed and leverage the auto-configuration features.

## What Is Spring?
Spring is an enterprise Java framework. It was designed to simplify Jakarta EE development and make developers more productive. Spring makes use of Inversion of Control and Dependency Injection to promote good software coding practices and speed up development time.

## What Is Hibernate/JPA?
Hibernate/JPA is an Object-to-Relational-Mapping (ORM) framework. It simplifies database access for Java applications. By using the framework, you can easily store and retrieve Java objects by setting up some simple configuration mappings.

## What is Maven ?
- Maven is prj mgmt tool
- used for build mgmt and dependencies.
When building java prj you may need additional JAR files, for eg. Spring, Hibernate, Commons Logging, JSON, etc.
Approach 1: Download these files from web and manually to the java buildpath/classpath.
Approach 2: Tell Maven about your needed dependencies and it will get it four you. Maven will make those JAR files available during compile and run time.
 

# Development process:
- Initialize prj using: https://start.spring.io/
- Download Zip and unzip it in local.
- Import project in IDE.
 
## File structure:
- Static folder: contains files like - HTML, CSS, JS, Images, etc.

## Actuator:
### Problems
- How to monitor and manage app ?
- How to check the app health ?
- How to access app metrics ?
### Solution:
- Exposes endpoints to monitor and manage app.
- We can easily get the Devops functionality out-of-the-box
- Simply add dependency to 'pom.xml'
- Rest endpoints are automatically added to app.
- Endpoint with Actuator:
- /health: http://localhost:8080/actuator/health
- /info
- /beans

To expose all endpoints like /beans, etc use this wildcard mentioned below in src/main/resources/application.properties file
management.endpoints.web.exposure.include=*

To exclude the endpoints:
management.endpoints.web.exposure.exclude=health,info
management.endpoints.web.exposure.exclude=*

## Spring boot security
- add spring-boot-starter-security in pom.xml
- After adding this as dependency and when u run project, it will print something like below in console:
````
Using generated security password: 40cb2419-707e-4563-b056-5b4bce4de7ba
This generated password is for development use only. Your security configuration must be updated before running your application in production.
````
- So, use above password and username: user

## Running spring boot application from commandline
### Two options:
1. Use java -jar:
    ````
   java -jar myapp.jar
   ````
2. Using spring boot Maven plugin:
   mvnw spring-boot: run
   
#### Steps:
- Go to the prj directory
- Type this command: 
  mvnw package
- Now:
  cd target
- Now:
````
 java -jar jarName.jar
  eg:
  java -jar firstapplication-0.0.1-SNAPSHOT.jar
 ````

## Application properties:
### It is grouped in 8 categories: core, web, security, data,Actuator, Integration, DevTools, testing
### Core:
````
# Log levels severity mapping
logging.level.org.springframework=DEBUG
logging.level.org.hibernate=TRACE
logging.level.org.luv2code=INFO

# Log file name
logging.file.name=crazy-stuff.log
logging.file.path=c:/myapps/demo

````

### Web:
````
#HTTP server port 
server.port=7070

# Context path of application
server.servlet.context-path=/my-first-app

# Default HTTP session time out
server.servlet.session.timeout=15m
````

### Actuator
````
management.endpoints.web.exposure.include=*
management.endpoints.web.exposure.include=health, info
management.endpoints.web.exposure.exclude=health, info
management.endpoints.web.base-path=/actuator
````

### Security
````
spring.security.user.name=admin
spreing.security.password=yash1234
````

### Data
````
spring.datasource.url=jdbc:mysql://localhost:3306/ecommerce
#username for DB
spring.datasource.username=yash
#password for DB
spring.datasource.password=yash12345
````


## Annotations

#### @GetMapping("/")
- used to define route/endpoint functions
#### @value
- used to get value from application.properties file


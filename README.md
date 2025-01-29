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

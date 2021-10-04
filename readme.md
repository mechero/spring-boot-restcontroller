# Spring Boot @RestController Example with Chaos Monkey Enabled in Spring Application Properties

## Description

This project contains the sample code used in [The Practical Developer Blog](https://thepracticaldeveloper.com/2017/03/04/restcontroller-spring-boot-example-with-springfox-swagger/). It's a Spring Boot application with one plain Java object (`SpanishGreeting`) and a Spring Controller `SpanishGreetingController`.

The main goal of the project is to show how to write a `@RestController` in Spring Boot and include documentation with Swagger.
 
## How does it work?

You can use the endpoints behind `http://localhost:8082/spanish-greetings`. If you append `/random` to a `GET` request you'll receive a random Spanish greeting (which are actually hard-coded). You can also `GET` them by `id` (only from 1 to 3). To create a new one, you need to perform a `POST` operation.

Actually, much better if you just start the application and navigate to `http://localhost:8082/swagger-ui.html`. There you'll find a nice API documentation thanks to Swagger. Moreover, *you can play with it*.

![Swagger Documentation](images/swagger.png)

Upon Succesful Initialization of Chaos Monkey you should see something like this : 

![image](https://user-images.githubusercontent.com/50335583/135620733-ee4eb8bc-918d-461a-8cca-40f085976f90.png)


In addition to the end points and controller, chaos testing can be done as shown using postman for the endpoints exposed under actuator:

![image](https://user-images.githubusercontent.com/50335583/135618904-26996ad8-1824-4d03-a97c-4e878b8ef2a2.png)
![image](https://user-images.githubusercontent.com/50335583/135619103-a6322eba-2fb0-4df9-847c-68daf95f5a6b.png)
![image](https://user-images.githubusercontent.com/50335583/135619155-9b62c70a-b8fa-4028-b11a-d58f2ba09b75.png)
![image](https://user-images.githubusercontent.com/50335583/135619288-a3968210-c7aa-48d9-8105-36be2bbacc18.png)
![image](https://user-images.githubusercontent.com/50335583/135619450-1a7e2d03-0fa4-4c14-bcdb-7d95c6cbee98.png)
![image](https://user-images.githubusercontent.com/50335583/135620247-d62f0021-a1e1-4464-9e62-0d58e705d623.png)






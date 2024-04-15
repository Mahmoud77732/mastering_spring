package com.springboot.spring_actuator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringActuatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringActuatorApplication.class, args);
	}

}

/*
* spring-boot-starter-actuator
http://localhost:8080/
http://localhost:8080/task
http://localhost:8080/actuator/beans
http://localhost:8080/actuator/mappings
http://localhost:8080/actuator/info

*  spring-boot-starter-security
    default:
        username = user
        password is in "output"
    custom:
        values in application.properties
*/

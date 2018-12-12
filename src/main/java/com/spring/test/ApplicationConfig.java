package com.spring.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class ApplicationConfig {

    @Bean Greeting greeting() {
        return new Greeting();
    }

    @Bean EmployeeController employeeController() {
        return new EmployeeController();
    }
}

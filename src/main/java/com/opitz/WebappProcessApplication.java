package com.opitz;


import org.camunda.bpm.spring.boot.starter.annotation.EnableProcessApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@EnableProcessApplication
@SpringBootApplication
public class WebappProcessApplication {


    public static void main(String... args) {
        SpringApplication.run(WebappProcessApplication.class, args);
    }
}


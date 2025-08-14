package com.javatechsoft.di.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;


@SpringBootApplication
public class SpringBootQualifierDemoApplication {

    @Autowired
    private ClassKLM classKLM; // This ensures Spring creates the bean

    public static void main(String[] args) {
        SpringApplication.run(SpringBootQualifierDemoApplication.class, args);
    }

    @PostConstruct
    public void init() {
        System.out.println("Main application started.");
    }
}

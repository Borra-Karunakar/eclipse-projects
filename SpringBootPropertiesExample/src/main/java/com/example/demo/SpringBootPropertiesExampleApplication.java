package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootPropertiesExampleApplication implements CommandLineRunner {

    @Autowired
    private AppProperties appProperties;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootPropertiesExampleApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        appProperties.printValues();
    }
}

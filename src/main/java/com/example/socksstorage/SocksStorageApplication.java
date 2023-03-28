package com.example.socksstorage;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition
public class SocksStorageApplication {

    public static void main(String[] args) {
        SpringApplication.run(SocksStorageApplication.class, args);
    }

}

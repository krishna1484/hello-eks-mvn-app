package com.example.helloeksmvnapp;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class HelloEksMvnAppApplication {

    @PostConstruct
    public void init() {
        log.info("Started the app, cool...");
    }

    public static void main(String[] args) {
        SpringApplication.run(HelloEksMvnAppApplication.class, args);
    }

}

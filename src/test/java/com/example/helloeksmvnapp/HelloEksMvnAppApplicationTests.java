package com.example.helloeksmvnapp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HelloEksMvnAppApplicationTests {

    Logger logger = LoggerFactory.getLogger(HelloEksMvnAppApplicationTests.class);
    @Test
    void contextLoads() {
        logger.info("starting junit tests....");
        Assertions.assertEquals("123","123");
    }

}

package com.ashish.mssc.msscbeerinventoryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.ashish")
public class MsscBeerInventoryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsscBeerInventoryServiceApplication.class, args);
    }

}

package com.iesemilidarder.webveloper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;



    @SpringBootApplication
    @EnableAutoConfiguration
    public class SpringLauncher {

        public static void main(String[] args) {
            SpringApplication.run(com.iesemilidarder.webveloper.SpringLauncher.class, args);
        }
    }

package com.healthme.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan("com.healthme.application")
public class WebAppInitializer{

    public static void main(String[] args) {
		SpringApplication.run(WebAppInitializer.class, args);
	}
}


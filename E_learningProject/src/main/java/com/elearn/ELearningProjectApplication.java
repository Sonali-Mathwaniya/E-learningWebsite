package com.elearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.elearn")
public class ELearningProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ELearningProjectApplication.class, args);
	}

}

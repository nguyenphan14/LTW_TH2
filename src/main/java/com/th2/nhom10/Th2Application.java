package com.th2.nhom10;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class Th2Application {

	public static void main(String[] args) {
		SpringApplication.run(Th2Application.class, args);
	}

}

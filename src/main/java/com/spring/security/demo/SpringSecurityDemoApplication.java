package com.spring.security.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringSecurityDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityDemoApplication.class, args);
		System.out.println("configured all the new updates \n" +
				"resolved maven dependencies\n " +
				"created database\n" +
				"first commit");
	}

}

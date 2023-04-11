package com.springrestjpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//it is used to mark a configuration class that declares one or more @bean also triggers auto configuration
@SpringBootApplication
public class SpringrestjpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringrestjpaApplication.class, args);
	}

}
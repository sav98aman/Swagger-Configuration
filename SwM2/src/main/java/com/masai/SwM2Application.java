package com.masai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class SwM2Application {

	public static void main(String[] args) {
		SpringApplication.run(SwM2Application.class, args);
	}

}

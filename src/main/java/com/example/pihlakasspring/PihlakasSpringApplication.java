package com.example.pihlakasspring;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class PihlakasSpringApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(PihlakasSpringApplication.class).build().run(args);
	}
}

package com.example.restapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class RestapiApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx
				= SpringApplication.run(RestapiApplication.class, args);
		GenerateIdService service = ctx.getBean(GenerateIdService.class);
		System.out.println("=====>" + service.getId());
	}

}

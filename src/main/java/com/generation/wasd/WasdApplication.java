package com.generation.wasd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.web.config.EnableSpringDataWebSupport;

@SpringBootApplication @EnableSpringDataWebSupport 
public class WasdApplication {

	public static void main(String[] args) {
		SpringApplication.run(WasdApplication.class, args);
	}

}

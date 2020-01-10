package com.example.SpringBootDeepAssign3Appplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;

@SpringBootApplication
public class SpringBootDeepAssign3Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDeepAssign3Application.class, args);
		
	}
	
	//@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/").setViewName("index");
	}

}

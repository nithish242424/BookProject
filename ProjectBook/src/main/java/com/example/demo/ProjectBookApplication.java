package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition
(info =@Info(
title = "Book Project",
version = "1.1.2",
description = "BOOK",
contact = @Contact(
		name = "Nithish",
		email = "nithishdream24@gmail.com"
		)
)
)
public class ProjectBookApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectBookApplication.class, args);
	}

}

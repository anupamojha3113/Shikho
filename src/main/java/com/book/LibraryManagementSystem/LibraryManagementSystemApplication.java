package com.book.LibraryManagementSystem;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title = "Library Management System",
				version = "1.0.0",
				description = "This is the RestAPI Documentation for the Library Management System"
),
servers = @Server(
		url="http://localhost:8080",
		description = "Library Management System"
)
)
public class LibraryManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibraryManagementSystemApplication.class, args);
		System.out.println("This is Library Management System");
	}

}

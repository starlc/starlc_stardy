package com.starlc.admindemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@SpringBootApplication
@Configuration
@EnableAdminServer
public class AdmindemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdmindemoApplication.class, args);
	}

}

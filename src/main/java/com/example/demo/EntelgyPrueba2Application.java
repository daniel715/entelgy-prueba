package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={
"com.example.demo.controlador", "com.example.demo.dao","com.example.demo.modelo","com.example.demo.service","com.example.demo"})
public class EntelgyPrueba2Application {

	public static void main(String[] args) {
		SpringApplication.run(EntelgyPrueba2Application.class, args);
	}

}

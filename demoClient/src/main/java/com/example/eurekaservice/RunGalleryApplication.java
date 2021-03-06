package com.example.eurekaservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class RunGalleryApplication {

	public static void main(String[] args) {
		SpringApplication.run(RunGalleryApplication.class, args);
	}

}

package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
public class ProfesorApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProfesorApplication.class, args);
	}

}

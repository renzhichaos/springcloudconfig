package com.example.config2server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableDiscoveryClient
@EnableConfigServer
@SpringBootApplication
public class Config2ServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Config2ServerApplication.class, args);
	}
}

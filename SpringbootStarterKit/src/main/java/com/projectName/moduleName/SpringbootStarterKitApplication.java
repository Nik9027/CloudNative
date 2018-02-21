package com.projectName.moduleName;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@SpringBootApplication
public class SpringbootStarterKitApplication {

	private static final Logger logger = LoggerFactory.getLogger(SpringbootStarterKitApplication.class);
	
	public static void main(String[] args) {
		
		logger.info("lets start our application.");
		SpringApplication.run(SpringbootStarterKitApplication.class, args);
	}
}

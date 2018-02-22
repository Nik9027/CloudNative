package com.projectName.moduleName;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SimpleHelloWorldApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleHelloWorldApiApplication.class, args);
	}
	
	@RequestMapping(value="/hello")
	public String helloMethod()
	{
		return "Hello World";
	}
}

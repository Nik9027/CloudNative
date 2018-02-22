package com.projectName.moduleName.starterKit.restTemplate;

import java.net.URI;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class CallApiUsingHystrix {

	@HystrixCommand(groupKey="fallback", commandKey="fallback", fallbackMethod = "reliable")
	public String CallHelloWorldAPI()
	{
		  RestTemplate restTemplate=new RestTemplate();
		    URI uri = URI.create("http://localhost:9012/hello");
		    return restTemplate.getForObject(uri, String.class);
		

		}
	
	  public String reliable() {
		    return "Hello Hystrix";
		  }

}

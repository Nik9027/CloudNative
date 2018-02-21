package com.projectName.moduleName.starterKit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.projectName.moduleName.starterKit.Exceptions.UserIdNotFoundException;
import com.projectName.moduleName.starterKit.restTemplate.CallAPI;
import com.projectName.moduleName.starterKit.service.SampleService;


@RestController
public class SampleController {
	


	@Value("${app.mode}")
	public String appMode;
	

	@Autowired
	SampleService service;
	
	@Autowired
	CallAPI callApi;
	
/*	@Autowired
	RepositoryMongoDB mongo;
	 defaultValue="user"
*/	
	

	
	
	@RequestMapping(value="/", method= RequestMethod.GET)
	
	
	public String helloGet(@RequestParam(value="name", required=true) String name ) throws Exception
	{
		
		
 	if(name.length()>0){
 			
 			
 		return service.getAppRunMode(name, appMode);
			
					
		}
 		else {
 			
 			throw new UserIdNotFoundException(name);

			
		}
	
	
	}
	

	@RequestMapping(value="/", method= RequestMethod.POST)
	
	public String helloPost(@RequestParam(value="name", required=false, defaultValue="user") String name ) 	{
		
			
			return service.getAppRunMode(name, appMode);
			
			
		
		
	}
	
	@RequestMapping(value="/appMode", method = RequestMethod.GET)
	public String getAppMode() {
		
		
		return appMode;
	}
	
	@RequestMapping(value="/restCall", method = RequestMethod.GET)
	public String getRestCall() {
		
		return callApi.callApiModeEndpoint();
	}
	
	

}

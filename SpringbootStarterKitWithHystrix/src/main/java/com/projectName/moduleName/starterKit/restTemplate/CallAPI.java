package com.projectName.moduleName.starterKit.restTemplate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.projectName.moduleName.starterKit.models.ConstantValues;

@Service
public class CallAPI {
	
	private static final Logger logger = LoggerFactory.getLogger(CallAPI.class);
	
	
	
	@Value("${server.port}")
	private int port;
	
	public String callApiModeEndpoint()
	{
		RestTemplate restTemplate = new RestTemplate();
		StringBuilder httpUrl = new StringBuilder();
		httpUrl.append(ConstantValues.LOCALHOST);
		httpUrl.append(port);
		httpUrl.append(ConstantValues.CTX_APE_MODE);
		
		logger.info("End point Called :"+ httpUrl.toString());
		
		return "Rest call to "+httpUrl+" gives output : "+ restTemplate.getForObject(httpUrl.toString(), String.class);
		
	}
	
	

}

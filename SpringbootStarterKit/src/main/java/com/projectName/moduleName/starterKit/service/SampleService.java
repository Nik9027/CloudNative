package com.projectName.moduleName.starterKit.service;

import org.springframework.stereotype.Service;

import com.projectName.moduleName.starterKit.models.ConstantValues;

@Service
public class SampleService {

	public String getAppRunMode(String name, String mode)
	{
		StringBuilder stringBuilder=new StringBuilder();
		stringBuilder.append(ConstantValues.HELLO);
		stringBuilder.append(ConstantValues.SPACE);
		stringBuilder.append(name);
		stringBuilder.append(ConstantValues.DOT);
		stringBuilder.append(ConstantValues.SPACE);
		stringBuilder.append(ConstantValues.APP_RUN_STATEMENT);
		stringBuilder.append(mode);
		stringBuilder.append(ConstantValues.MODE);
		stringBuilder.append(ConstantValues.DOT);
		
		return stringBuilder.toString();
		
		}
}

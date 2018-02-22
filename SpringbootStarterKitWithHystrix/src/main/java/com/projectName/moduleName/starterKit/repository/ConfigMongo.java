package com.projectName.moduleName.starterKit.repository;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;

@Configuration
@Conditional(ConfigMongo.class)
public class ConfigMongo extends AbstractMongoConfiguration implements Condition {

	@Value("${spring.data.mongodb.host}")  //if it is stored in application.yml, else hard code it here
	private String host;

	@Value("${spring.data.mongodb.port}")
	private Integer port;
	
	@Value("${spring.data.mongodb.database}")
	private String database;
	
	
	@Override
	protected String getDatabaseName() {
		// TODO Auto-generated method stub
		return database;
	}

	@Override
	public Mongo mongo() throws Exception {
		// TODO Auto-generated method stub
		return new MongoClient(host, port);
	}

	@Override
	public boolean matches(ConditionContext arg0, AnnotatedTypeMetadata arg1) {
		// TODO Auto-generated method stub
		return false;
	}

}

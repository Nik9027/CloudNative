package com.projectName.moduleName.starterKit.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.projectName.moduleName.starterKit.models.MongoSampleModel;

@Transactional
@Repository
public interface RepositoryMongoDB extends MongoRepository<MongoSampleModel, String> {

}

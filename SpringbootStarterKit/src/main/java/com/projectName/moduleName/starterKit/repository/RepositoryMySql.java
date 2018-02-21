package com.projectName.moduleName.starterKit.repository;

import org.springframework.data.repository.CrudRepository;

import com.projectName.moduleName.starterKit.models.SampleModel;

public interface RepositoryMySql extends CrudRepository<SampleModel, Long>{

}

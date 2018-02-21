package com.projectName.moduleName.starterKit.repository;

import org.springframework.data.repository.CrudRepository;

import com.projectName.moduleName.starterKit.models.SampleModel;

public interface RepositoryPostGreSql extends CrudRepository<SampleModel, Long>{

}

package com.ucundi.demo.repositories;

import org.springframework.data.repository.CrudRepository;

import com.ucundi.demo.domain.mousesEntity;

public interface mousesRepositories extends CrudRepository<mousesEntity, Long>{
    
}

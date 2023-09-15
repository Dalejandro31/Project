package com.ucundi.demo.repositories;

import org.springframework.data.repository.CrudRepository;

import com.ucundi.demo.domain.serviciosEntity;

public interface serviciosRepositories extends CrudRepository<serviciosEntity, Long> {
    
}

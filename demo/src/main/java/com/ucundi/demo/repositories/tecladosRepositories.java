package com.ucundi.demo.repositories;

import com.ucundi.demo.domain.monitoresEntity;
import org.springframework.data.repository.CrudRepository;

import com.ucundi.demo.domain.tecladosEntity;

import java.util.Optional;

public interface tecladosRepositories extends CrudRepository<tecladosEntity, Long> {
    Optional<tecladosEntity> findById(Long id);

    void deleteById(Long id);
}
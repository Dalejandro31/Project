package com.ucundi.demo.repositories;

import com.ucundi.demo.domain.monitoresEntity;
import org.springframework.data.repository.CrudRepository;

import com.ucundi.demo.domain.mousesEntity;

import java.util.Optional;

public interface mousesRepositories extends CrudRepository<mousesEntity, Long>{
    Optional<mousesEntity> findById(Long id);

    void deleteById(Long id);
}

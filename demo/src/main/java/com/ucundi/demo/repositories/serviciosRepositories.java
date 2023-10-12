package com.ucundi.demo.repositories;

import com.ucundi.demo.domain.monitoresEntity;
import org.springframework.data.repository.CrudRepository;

import com.ucundi.demo.domain.serviciosEntity;

import java.util.Optional;

public interface serviciosRepositories extends CrudRepository<serviciosEntity, Long> {
    Optional<serviciosEntity> findById(Long id);

    void deleteById(Long id);
}

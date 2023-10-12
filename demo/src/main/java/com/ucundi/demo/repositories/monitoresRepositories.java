package com.ucundi.demo.repositories;
import org.springframework.data.repository.CrudRepository;
import com.ucundi.demo.domain.monitoresEntity;

import java.util.Optional;

public interface monitoresRepositories extends CrudRepository<monitoresEntity, Long>{
    Optional<monitoresEntity> findById(Long id);

    void deleteById(Long id);
}

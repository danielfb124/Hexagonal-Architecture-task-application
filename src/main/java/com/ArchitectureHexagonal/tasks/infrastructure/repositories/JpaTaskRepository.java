package com.ArchitectureHexagonal.tasks.infrastructure.repositories;

import com.ArchitectureHexagonal.tasks.infrastructure.entities.TaskEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaTaskRepository extends JpaRepository<TaskEntity,Long> {

}

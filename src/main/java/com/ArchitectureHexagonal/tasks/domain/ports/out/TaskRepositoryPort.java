package com.ArchitectureHexagonal.tasks.domain.ports.out;

import com.ArchitectureHexagonal.tasks.domain.models.Task;

import java.util.List;
import java.util.Optional;

public interface TaskRepositoryPort {
    Task save(Task task);
    Optional<Task> findbyId(Long id);
    List<Task> findAll();
    Optional<Task>update(Task task);
    boolean deleteById(Long id);
}

package com.ArchitectureHexagonal.tasks.domain.ports.in;

import com.ArchitectureHexagonal.tasks.domain.models.Task;

import java.util.Optional;

public interface UpdateTaskUseCase {

    Optional<Task> updateTask(Long id, Task updateTask);
}

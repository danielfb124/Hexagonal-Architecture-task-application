package com.ArchitectureHexagonal.tasks.application.usecases;

import com.ArchitectureHexagonal.tasks.domain.models.Task;
import com.ArchitectureHexagonal.tasks.domain.ports.in.UpdateTaskUseCase;
import com.ArchitectureHexagonal.tasks.domain.ports.out.TaskRepositoryPort;

import java.util.Optional;

public class UpdateTaskUseCaseImpl implements UpdateTaskUseCase {

    private final TaskRepositoryPort taskRepositoryPort;

    public UpdateTaskUseCaseImpl(TaskRepositoryPort taskRepositoryPort) {
        this.taskRepositoryPort = taskRepositoryPort;
    }


    @Override
    public Optional<Task> updateTask(Long id, Task updateTask) {
        return taskRepositoryPort.update(updateTask);
    }
}

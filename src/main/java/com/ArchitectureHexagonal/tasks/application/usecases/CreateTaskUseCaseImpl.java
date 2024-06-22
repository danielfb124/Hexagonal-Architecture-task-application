package com.ArchitectureHexagonal.tasks.application.usecases;

import com.ArchitectureHexagonal.tasks.domain.models.Task;
import com.ArchitectureHexagonal.tasks.domain.ports.in.CreateTaskUseCase;
import com.ArchitectureHexagonal.tasks.domain.ports.out.TaskRepositoryPort;

public class CreateTaskUseCaseImpl implements CreateTaskUseCase {

    private final TaskRepositoryPort taskRepositoryPort;

    public CreateTaskUseCaseImpl(TaskRepositoryPort taskRepositoryPort) {
        this.taskRepositoryPort = taskRepositoryPort;
    }

    @Override
    public Task createTask(Task task) {
        return taskRepositoryPort.save(task);
    }
}

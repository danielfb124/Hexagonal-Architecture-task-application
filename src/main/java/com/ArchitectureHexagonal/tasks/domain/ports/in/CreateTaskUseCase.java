package com.ArchitectureHexagonal.tasks.domain.ports.in;
import com.ArchitectureHexagonal.tasks.domain.models.Task;
public interface CreateTaskUseCase {

    Task createTask(Task task);

}

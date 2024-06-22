package com.ArchitectureHexagonal.tasks.infrastructure.config;

import com.ArchitectureHexagonal.tasks.application.services.TaskService;
import com.ArchitectureHexagonal.tasks.application.usecases.*;
import com.ArchitectureHexagonal.tasks.domain.ports.in.GetAdditionalTaskInfoUseCase;
import com.ArchitectureHexagonal.tasks.domain.ports.out.ExternalServicePort;
import com.ArchitectureHexagonal.tasks.domain.ports.out.TaskRepositoryPort;
import com.ArchitectureHexagonal.tasks.infrastructure.adapters.ExternalServiceAdapter;
import com.ArchitectureHexagonal.tasks.infrastructure.repositories.JpaTaskRepositoryAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean
    public TaskService taskService(TaskRepositoryPort taskRepositoryPort, GetAdditionalTaskInfoUseCase getAdditionalTaskInfoUseCase) {
        return new TaskService(
                new CreateTaskUseCaseImpl(taskRepositoryPort),
                new RetrieveTaskUseCaseImpl(taskRepositoryPort),
                new UpdateTaskUseCaseImpl(taskRepositoryPort),
                new DeleteTaskUseCaseImpl(taskRepositoryPort),
                getAdditionalTaskInfoUseCase
        );
    }
    @Bean
    public TaskRepositoryPort taskRepositoryPort(JpaTaskRepositoryAdapter jpaTaskRepositoryAdapter){
        return jpaTaskRepositoryAdapter;
    }
    @Bean
    public GetAdditionalTaskInfoUseCase getAdditionalTaskInfoUseCase(ExternalServicePort externalServicePort){
        return new GetAdditionalTaskInfoUseCaseImpl(externalServicePort);
    }
    @Bean
    public ExternalServicePort externalServicePort(){
        return new ExternalServiceAdapter();
    }
}


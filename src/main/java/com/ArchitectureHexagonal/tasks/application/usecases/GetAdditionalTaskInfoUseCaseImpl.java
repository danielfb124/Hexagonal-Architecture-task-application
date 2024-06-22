package com.ArchitectureHexagonal.tasks.application.usecases;

import com.ArchitectureHexagonal.tasks.domain.models.AdditionalTaskInfo;
import com.ArchitectureHexagonal.tasks.domain.ports.in.GetAdditionalTaskInfoUseCase;
import com.ArchitectureHexagonal.tasks.domain.ports.out.ExternalServicePort;

public class GetAdditionalTaskInfoUseCaseImpl implements GetAdditionalTaskInfoUseCase {
    private final ExternalServicePort externalServicePort;

    public GetAdditionalTaskInfoUseCaseImpl(ExternalServicePort externalServicePort) {
        this.externalServicePort = externalServicePort;
    }

    @Override
    public AdditionalTaskInfo getAdditionalTaskInfo(Long id) {
        return externalServicePort.getAdditionalTaskInfo(id);
    }
}

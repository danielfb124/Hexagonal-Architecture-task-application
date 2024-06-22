package com.ArchitectureHexagonal.tasks.domain.ports.in;

import com.ArchitectureHexagonal.tasks.domain.models.AdditionalTaskInfo;

public interface GetAdditionalTaskInfoUseCase {
    AdditionalTaskInfo getAdditionalTaskInfo(Long id);
}

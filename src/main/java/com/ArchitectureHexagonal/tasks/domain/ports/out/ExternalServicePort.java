package com.ArchitectureHexagonal.tasks.domain.ports.out;

import com.ArchitectureHexagonal.tasks.domain.models.AdditionalTaskInfo;

public interface ExternalServicePort {
    AdditionalTaskInfo getAdditionalTaskInfo(Long taskId);
}

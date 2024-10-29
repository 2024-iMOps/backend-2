package com.imbank.imops.domain.ai.repository;

import com.imbank.imops.domain.ai.entity.ModelConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ModelConfigurationRepository extends JpaRepository<ModelConfiguration, Long> {
}

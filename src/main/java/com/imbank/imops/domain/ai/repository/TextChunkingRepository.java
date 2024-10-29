package com.imbank.imops.domain.ai.repository;

import com.imbank.imops.domain.ai.entity.TextChunking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TextChunkingRepository extends JpaRepository<TextChunking, Long> {
}

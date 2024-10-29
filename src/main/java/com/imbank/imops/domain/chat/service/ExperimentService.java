package com.imbank.imops.domain.chat.service;

import com.imbank.imops.domain.chat.dto.ExperimentDetailResponseDto;
import com.imbank.imops.domain.chat.dto.ExperimentResponseDto;
import com.imbank.imops.domain.chat.entity.Chat;
import com.imbank.imops.domain.chat.repository.ChatRepository;
import com.imbank.imops.domain.chat.repository.ExperimentRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Log4j2
@RequiredArgsConstructor
@Service
public class ExperimentService {
    private final ChatRepository chatRepository;
    private final ExperimentRepository experimentRepository;

    @Transactional(readOnly = true)
    public List<ExperimentResponseDto> getExperimentList(Long chatId) {
        Chat chat = chatRepository.findById(chatId)
                .orElseThrow(() -> new RuntimeException("없는 채팅입니다"));
        return experimentRepository.getExperimentList(chat);
    }

    @Transactional(readOnly = true)
    public ExperimentDetailResponseDto getExperimentDetail(Long experimentId) {
        experimentRepository.findById(experimentId)
                .orElseThrow(() -> new RuntimeException("없는 실험입니다"));
        return experimentRepository.getExperimentDetail(experimentId);
    }
}

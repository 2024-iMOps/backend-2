package com.imbank.imops.domain.chat.dto;

import lombok.*;

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ExperimentDetailResponseDto {
    private String question;
    private String answer;

    // Model Configuration 정보
    private Double temperature;
    private Integer maxTokens;
    private Double topP;
    private Double frequencyPenalty;
    private Double presencePenalty;

    // Model 정보
    private String embedding;
    private String LLM;

    // TextChunking 정보
    private String method;
    private Integer size;
    private Integer overlap;

}

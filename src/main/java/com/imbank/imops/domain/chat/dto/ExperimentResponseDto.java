package com.imbank.imops.domain.chat.dto;

import lombok.*;

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ExperimentResponseDto {
    private Long id;
    private Double score;
}

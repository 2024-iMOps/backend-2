package com.imbank.imops.domain.chat.dto;

import lombok.*;

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ChatResponseDto {
    private Long id;
    private String question;
}

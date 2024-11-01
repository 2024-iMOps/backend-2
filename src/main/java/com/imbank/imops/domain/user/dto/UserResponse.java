package com.imbank.imops.domain.user.dto;

public class UserResponse {
    private String openAi;
    private String anthropic;
    private String upstage;

    // 생성자
    public UserResponse(String openAi, String anthropic, String upstage) {
        this.openAi = openAi;
        this.anthropic = anthropic;
        this.upstage = upstage;
    }

    // Getters
    public String getOpenAi() {
        return openAi;
    }

    public String getAnthropic() {
        return anthropic;
    }

    public String getUpstage() {
        return upstage;
    }
}

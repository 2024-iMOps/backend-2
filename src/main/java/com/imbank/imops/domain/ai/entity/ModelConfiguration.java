package com.imbank.imops.domain.ai.entity;

import com.imbank.imops.security.BaseTimeEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@Getter
@Table
@DynamicUpdate
@DynamicInsert
@NoArgsConstructor
@ToString
public class ModelConfiguration extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private Double temperature;

    @NotNull
    private Integer maxTokens;

    @NotNull
    private Double topP;

    @NotNull
    private Double frequencyPenalty;

    @NotNull
    private Double presencePenalty;
}
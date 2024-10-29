package com.imbank.imops.domain.chat.entity;

import com.imbank.imops.domain.ai.entity.EmbeddingModel;
import com.imbank.imops.domain.ai.entity.ModelConfiguration;
import com.imbank.imops.domain.ai.entity.TextChunking;
import com.imbank.imops.domain.user.entity.User;
import com.imbank.imops.global.BaseTimeEntity;
import jakarta.persistence.*;
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
public class Experiment extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private User user;

    @ManyToOne
    private Chat chat;

    @ManyToOne
    private TextChunking textChunking;

    @ManyToOne
    private ModelConfiguration modelConfiguration;

    @ManyToOne
    private EmbeddingModel embeddingModel;

    private String answer;

    private Integer score1;

    private Integer score2;

    private Integer score3;

    private String feedback;

    private String pdfData;
}

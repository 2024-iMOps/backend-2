package com.imbank.imops.domain.chat.entity;

import com.imbank.imops.domain.ai.entity.Model;
import com.imbank.imops.domain.ai.entity.ModelConfiguration;
import com.imbank.imops.domain.ai.entity.TextChunking;
import com.imbank.imops.domain.user.entity.User;
import com.imbank.imops.security.BaseTimeEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import java.util.List;

@Entity
@Getter
@Table
@DynamicUpdate
@DynamicInsert
@NoArgsConstructor
@ToString
public class Chat extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private User user;

    @ManyToOne
    private TextChunking textChunking;

    @ManyToOne
    private ModelConfiguration modelConfiguration;

    @ManyToOne
    private Model model;

    @NotNull
    private String question;

    @ToString.Exclude
    @OneToMany(mappedBy = "chat", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<MetaData> metaData;

}

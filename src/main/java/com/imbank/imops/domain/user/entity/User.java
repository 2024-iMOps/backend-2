package com.imbank.imops.domain.user.entity;


import com.imbank.imops.global.BaseTimeEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
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
public class User extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String username;

    @NotNull
    private String password;

    private String openAi;

    private String anthropic;

    private String upstage;

    @Builder
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

}

package com.imbank.imops.domain.chat.entity;

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
public class Pdf extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String boundingBox;
}
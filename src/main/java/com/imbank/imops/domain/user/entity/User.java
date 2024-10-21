package com.imbank.imops.domain.user.entity;


import com.imbank.imops.security.BaseTimeEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.ToString;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@Getter
@Table(name = "USER_APP", indexes = @Index(name = "idx_username", columnList = "username", unique = true))
@DynamicUpdate
@ToString
public class User extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

}

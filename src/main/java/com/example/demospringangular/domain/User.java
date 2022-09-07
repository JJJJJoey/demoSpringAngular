package com.example.demospringangular.domain;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@ToString(callSuper = true)
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "USERS", indexes = {@Index(name = "USER_IDX_01", columnList = "email")})
@SequenceGenerator(name = "idGenerator", sequenceName = "USER_SEQ", initialValue = 1, allocationSize = 1)
public class User extends BaseModel{
    @Column(length = 50, nullable = false, unique = true)
    @NotNull
    @Email
    private String email;

    @Column(length = 20, nullable = false)
    @NotNull
    private String firstname;

    @Column(length = 30, nullable = false)
    @NotNull
    private String lastname;
}

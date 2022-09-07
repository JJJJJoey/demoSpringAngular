package com.example.demospringangular.domain;

import lombok.Getter;
import lombok.ToString;

import java.io.Serial;
import java.io.Serializable;
import javax.persistence.*;

@Getter
@ToString
@MappedSuperclass

public abstract class BaseModel implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "idGenerator")
    @Column(updatable = false)
    private Long id;
}

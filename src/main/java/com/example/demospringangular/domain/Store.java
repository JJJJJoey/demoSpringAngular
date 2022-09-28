package com.example.demospringangular.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@ToString(callSuper = true)
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "STORES", indexes = {@Index(name = "STORE_IDX_01", columnList = "name")})
@SequenceGenerator(name = "idGenerator", sequenceName = "STORES_SEQ", initialValue = 1, allocationSize = 1)

public class Store extends BaseModel{
    @Column(length = 50, nullable = false)
    @NotNull
    private String name;
    @Column(length = 50, nullable = false)
    @NotNull
    private String address;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @NotNull
    private StoreCategory storeCategory;


}

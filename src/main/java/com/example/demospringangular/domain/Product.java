package com.example.demospringangular.domain;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Getter
@Setter
@ToString(callSuper = true)
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "PRODUCTS", indexes = {@Index(name = "PRODUCT_IDX_01", columnList = "serial"),})
@SequenceGenerator(name = "idGenerator", sequenceName = "PRODUCTS_SEQ", initialValue = 1, allocationSize = 1)
public class Product extends BaseModel {

    @NotNull
    private String name;
    @Column(precision = 10, scale = 2, nullable = false)
    @NotNull
    private BigDecimal price;
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @NotNull
    private StoreCategory category;
}
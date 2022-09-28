package com.example.demospringangular.domain;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

@Getter
@Setter
@ToString(callSuper = true)
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ORDERS")
@SequenceGenerator(name = "idGenerator", sequenceName = "ORDERS_SEQ", initialValue = 1, allocationSize = 1)
public class Order extends BaseModel {
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @NotNull
    private User user;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Date submitDate;

    @ToString.Exclude
    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    @NotNull
    private Set<@NotNull OrderItem> orderItems;

    @Enumerated(EnumType.STRING)
    @Column(length = 13, nullable = false)
    @NotNull
    private PaymentMethod paymentMethod;

    @Column(precision = 10, scale = 2, nullable = false)
    private BigDecimal cost;
}
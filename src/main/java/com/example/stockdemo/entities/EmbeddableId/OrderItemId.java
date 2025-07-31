package com.example.stockdemo.entities.EmbeddableId;

import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class OrderItemId implements Serializable {
    private Long productId;
    private Long orderId;

}

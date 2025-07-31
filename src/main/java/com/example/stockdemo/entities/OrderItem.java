package com.example.stockdemo.entities;

import com.example.stockdemo.entities.EmbeddableId.OrderItemId;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class OrderItem {

    @EmbeddedId
    private OrderItemId id;
    @ManyToOne
    @MapsId("productId")
    private Product product;

    @ManyToOne
    @MapsId("orderId")
    private Order order;

    private int quantity;

    // Getters and setters
}

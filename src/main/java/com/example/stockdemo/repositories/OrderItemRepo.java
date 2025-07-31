package com.example.stockdemo.repositories;

import com.example.stockdemo.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface OrderItemRepo extends JpaRepository<OrderItem,Long> {
}

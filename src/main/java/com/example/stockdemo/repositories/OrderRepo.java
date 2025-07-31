package com.example.stockdemo.repositories;

import com.example.stockdemo.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface OrderRepo extends JpaRepository<Order,Long> {
}

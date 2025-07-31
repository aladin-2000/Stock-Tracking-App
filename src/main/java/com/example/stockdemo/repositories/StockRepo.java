package com.example.stockdemo.repositories;

import com.example.stockdemo.entities.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StockRepo extends JpaRepository<Stock,Long> {
}

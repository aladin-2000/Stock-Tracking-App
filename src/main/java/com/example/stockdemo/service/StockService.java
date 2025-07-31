package com.example.stockdemo.service;

import com.example.stockdemo.entities.Provider;
import com.example.stockdemo.entities.Stock;
import com.example.stockdemo.repositories.ProviderRepo;
import com.example.stockdemo.repositories.StockRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockService {

    @Autowired
    private StockRepo stockRepo;

    public List<Stock> getAllProviders() {
        return  stockRepo.findAll();
    }
}

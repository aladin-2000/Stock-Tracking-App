package com.example.stockdemo.service;

import com.example.stockdemo.entities.Provider;
import com.example.stockdemo.repositories.ProviderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProviderRepo providerRepo;

    public List<Provider> getAllProviders() {
        return  providerRepo.findAll();
    }
}

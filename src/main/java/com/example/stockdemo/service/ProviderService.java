package com.example.stockdemo.service;

import com.example.stockdemo.Dtos.ProviderFilterDTO;
import com.example.stockdemo.entities.Product;
import com.example.stockdemo.entities.Provider;
import com.example.stockdemo.exceptions.NotFoundException;
import com.example.stockdemo.repositories.ProviderRepo;
import com.example.stockdemo.repositories.Specifications.ProviderSpecification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProviderService {

    @Autowired
    private ProviderRepo providerRepo;

    public List<Provider> getAllProviders() {
        return  providerRepo.findAll();
    }

    public List<Product> getAllProducts(Long providerId) {
        Optional<Provider> optionalProvider = providerRepo.findById(providerId);
        return optionalProvider.map(provider -> provider.getProducts()).orElseThrow(
                () -> new NotFoundException("Provider with ID " + providerId + " not found"));
    }

    public List<Provider> getProvidersByCriteria(ProviderFilterDTO filer) {
        Specification<Provider> spec = ProviderSpecification.NameLike(filer.getName())
                .and(ProviderSpecification.CityLike(filer.getCity()))
                .and(ProviderSpecification.EmailLike(filer.getEamil()));

        return providerRepo.findAll(spec);
    }


}

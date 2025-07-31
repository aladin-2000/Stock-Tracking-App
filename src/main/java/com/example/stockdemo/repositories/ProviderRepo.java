package com.example.stockdemo.repositories;

import com.example.stockdemo.entities.Provider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;


@Repository
public interface ProviderRepo extends JpaRepository<Provider, Long>, JpaSpecificationExecutor<Provider> {
}

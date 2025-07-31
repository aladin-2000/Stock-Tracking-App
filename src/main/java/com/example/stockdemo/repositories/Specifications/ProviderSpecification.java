package com.example.stockdemo.repositories.Specifications;

import com.example.stockdemo.entities.Provider;
import org.springframework.data.jpa.domain.Specification;

public class ProviderSpecification {

    public static Specification<Provider> NameLike(String name) {
        return (root, query, criteriaBuilder) ->
                name == null ? null : criteriaBuilder.like(criteriaBuilder.lower(root.get("name")), "%" + name.toLowerCase() + "%");
    }

    public static Specification<Provider> CityLike(String city) {
        return (root, query, criteriaBuilder) ->
                city == null ? null : criteriaBuilder.like(root.get("city"), city);
    }

    public static Specification<Provider> EmailLike(String email) {
        return (root, query, criteriaBuilder) ->
                email == null ? null : criteriaBuilder.like(root.get("email"), email);
    }

    // Add more criteria as needed...
}
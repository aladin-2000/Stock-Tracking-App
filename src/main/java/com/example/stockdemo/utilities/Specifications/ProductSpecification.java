package com.example.stockdemo.utilities.Specifications;

import com.example.stockdemo.entities.Product;
import org.springframework.data.jpa.domain.Specification;

import java.math.BigDecimal;

public class ProductSpecification {
    public static Specification<Product> productNameLike(String productName) {
        return (root, query , criteriaBuilder)->{
            return criteriaBuilder.like(criteriaBuilder.lower(root.get("name")) , "%"+productName.toLowerCase() +"%");
        };
    }
    public static Specification<Product> hasPriceLessThan(BigDecimal price) {
        return (root,query,cb)->{
               return cb.lessThan(root.get("price"), price);
        };
    }
    public static Specification<Product> hasPriceGreaterThan(BigDecimal price) {
        return (root,query,cb)->{
            return cb.greaterThan(root.get("price"), price);
        };
    }

    public static Specification<Product> hasPriceBetween(BigDecimal priceMin, BigDecimal priceMax) {
        return (root,query,cb)->{
            return cb.between(root.get("price"), priceMin, priceMax);
        };
    }
}

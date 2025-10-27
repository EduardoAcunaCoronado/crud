package com.ejemplo.crud.repositories;

import org.springframework.data.repository.CrudRepository;

import com.ejemplo.crud.entities.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {
    boolean existsBySku(String sku);
}

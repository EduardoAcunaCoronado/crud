package com.ejemplo.crud.services;

import com.ejemplo.crud.entities.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    List<Product> findAll();
    Optional<Product> findById(Long id);
    Product save(Product product);
    Optional<Product> update(Long id, Product product);
    Optional<Product> deleteById(Long id);
    Optional<Product> delete(Product product);
    boolean existsBySku(String sku);
}

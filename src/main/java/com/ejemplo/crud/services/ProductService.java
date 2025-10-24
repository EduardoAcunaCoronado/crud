package com.ejemplo.crud.services;

import com.ejemplo.crud.entities.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    List<Product> findAll();
    Optional<Product> findById(Long id);
    Product save(Product product);
    void deleteById(Long id);
    Optional<Product> delete(Product product);
}

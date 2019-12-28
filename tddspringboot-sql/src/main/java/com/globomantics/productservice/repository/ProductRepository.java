package com.globomantics.productservice.repository;

import com.globomantics.productservice.model.Product;

import java.util.List;
import java.util.Optional;


public interface ProductRepository {
    
    Optional<Product> findById(Integer id);

    
    List<Product> findAll();

    
    boolean update(Product product);

    
    Product save(Product product);

    
    boolean delete(Integer id);
}

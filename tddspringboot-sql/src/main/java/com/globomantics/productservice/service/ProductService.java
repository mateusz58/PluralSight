package com.globomantics.productservice.service;

import com.globomantics.productservice.model.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    
    Optional<Product> findById(Integer id);

    
    List<Product> findAll();

    
    boolean update(Product product);

    
    Product save(Product product);

    
    boolean delete(Integer id);
}

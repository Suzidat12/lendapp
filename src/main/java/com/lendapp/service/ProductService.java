package com.lendapp.service;

import com.lendapp.model.Product;

import java.util.HashMap;
import java.util.Optional;

public interface ProductService {
    HashMap listProducts();
    Optional<Product> findProductById(Integer productId);
}

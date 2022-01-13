package com.ecomerceApp.products.service;

import com.ecomerceApp.products.entity.Product;
import com.ecomerceApp.products.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }
}

package com.ecomerceApp.products.controller;

import com.ecomerceApp.products.entity.Product;
import com.ecomerceApp.products.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

public class ProductController {

    @Autowired
    private ProductService productService;

//    @GetMapping("/pro")
//    public ResponseEntity<?> getAllProducts(){
//        Collection<Product> products = productService.getAllProducts();
//        products.stream().forEach(x-> System.out.println(x));
//        return new ResponseEntity<>(products, HttpStatus.OK);
//    }
}

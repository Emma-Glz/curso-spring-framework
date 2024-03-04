package com.vasscompany.webapp.springweb.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vasscompany.webapp.springweb.models.Product;
import com.vasscompany.webapp.springweb.service.ProductServiceImpl;

@RestController
@RequestMapping("/api")
public class ProductController {

    @Autowired
    ProductServiceImpl service;

    @GetMapping
    public List<Product> listProducts(){
        return service.findAllProducts();
    }

    @GetMapping("/{id}")
    public Product findProductById(@PathVariable Long id){
        return service.findProductById(id);
    }
}

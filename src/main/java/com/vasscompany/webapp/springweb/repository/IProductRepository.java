package com.vasscompany.webapp.springweb.repository;

import java.util.List;

import com.vasscompany.webapp.springweb.models.Product;

public interface IProductRepository {

    List<Product> findAllProducts();

    Product findProductById(Long id);
}

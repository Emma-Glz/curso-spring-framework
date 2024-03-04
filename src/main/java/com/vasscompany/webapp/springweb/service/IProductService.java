package com.vasscompany.webapp.springweb.service;

import java.util.List;

import com.vasscompany.webapp.springweb.models.Product;

public interface IProductService {

    List<Product> findAllProducts();

    Product findProductById(Long id);

}

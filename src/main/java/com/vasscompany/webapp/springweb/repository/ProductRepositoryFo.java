package com.vasscompany.webapp.springweb.repository;

import java.util.Collections;
import java.util.List;

import com.vasscompany.webapp.springweb.models.Product;

public class ProductRepositoryFo implements IProductRepository{

    @Override
    public List<Product> findAllProducts() {

        return Collections.singletonList(new Product(1L,"Audifos Lg", 150L));
        
    }

    @Override
    public Product findProductById(Long id) {

        return new Product(id, "Mica de cristal", 100L);
    }
}

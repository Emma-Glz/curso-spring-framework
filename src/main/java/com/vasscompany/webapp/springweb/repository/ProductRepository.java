package com.vasscompany.webapp.springweb.repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.vasscompany.webapp.springweb.models.Product;

public class ProductRepository {

    private List<Product> products;

    public ProductRepository(){
        this.products = Arrays.asList(
            new Product(1L, "Mause LG", 200L),
            new Product(2L, "Samsung A20", 9899L),
            new Product(3L, "Teclado Razer", 9899L),
            new Product(3L, "TV LG", 6000L)
        );
    }

    public List<Product> findAllProducts(){
        return this.products;
    }

    public Product findProductById(Long id){

        return this.products.stream().filter(p -> p.getId().equals(id)).findFirst().orElse(null);
        

    }

}

package com.vasscompany.webapp.springweb.repository;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.vasscompany.webapp.springweb.models.Product;

//@RequestScope
@Repository
public class ProductRepositoryImpl implements IProductRepository {

    private List<Product> products;

    public ProductRepositoryImpl(){
        this.products = Arrays.asList(
            new Product(1L, "Mause LG", 200L),
            new Product(2L, "Samsung A20", 9899L),
            new Product(3L, "Teclado Razer", 9899L),
            new Product(4L, "TV LG", 6000L)
        );
    }

    @Override
    public List<Product> findAllProducts(){
        return this.products;
    }

    @Override
    public Product findProductById(Long id){

        return this.products.stream().filter(p -> p.getId().equals(id)).findFirst().orElse(null);
        

    }

}

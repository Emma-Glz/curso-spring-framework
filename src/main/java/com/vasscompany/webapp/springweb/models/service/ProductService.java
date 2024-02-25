package com.vasscompany.webapp.springweb.models.service;

import java.util.List;
import java.util.stream.Collectors;

import com.vasscompany.webapp.springweb.models.Product;
import com.vasscompany.webapp.springweb.repository.ProductRepository;

public class ProductService {

    private ProductRepository repo = new ProductRepository();

    public List<Product> findAllProducts(){
        return repo.findAllProducts().stream().map( p -> {
            Double princeImp = p.getPrice() * 1.16d;
            //Product product = new Product(p.getId(),p.getName(),princeImp.longValue());
            Product product = (Product) p.clone();
            product.setPrice(princeImp.longValue());
            return product;
           }).collect(Collectors.toList());
    }

    public Product findProductById(Long id){
        return repo.findProductById(id);
    }
}

package com.vasscompany.webapp.springweb.repository;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.vasscompany.webapp.springweb.models.Product;

public class ProductRepositoryJson implements IProductRepository {

    private List<Product> list;

    public ProductRepositoryJson() {
        Resource Resorce = new ClassPathResource("json/product.json");
        readValueJson(Resorce);

    }
    
    public ProductRepositoryJson(Resource resource) {
        readValueJson(resource);

    }
    private void readValueJson(Resource resource) {
        ObjectMapper ojMapper = new ObjectMapper();
        try {
            list = Arrays.asList(ojMapper.readValue(resource.getInputStream(), Product[].class));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public List<Product> findAllProducts() {
        return list;
    }

//    @Override
//    public Product findProductById(Long id) {
//        return list.stream().filter(p -> {
//            return p.getId().equals(id);
//        }).findFirst().orElseThrow();
//   }

    @Override
    public Product findProductById(Long id) {
        return list.stream().filter(p -> p.getId().equals(id)).findFirst().orElseThrow();
    }
}
package com.vasscompany.webapp.springweb.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.vasscompany.webapp.springweb.models.Product;
import com.vasscompany.webapp.springweb.repository.IProductRepository;

@Service
public class ProductServiceImpl implements IProductService{
    //@Qualifier("productRepositoryImpl")
    @Autowired
    private IProductRepository repo;

    @Value("${config.properties}")
    private Double configProperties;
    
    //@Autowired
    //public ProductServiceImpl(@Qualifier("productRepositoryFo") IProductRepository repo) {
    //    this.repo = repo;
    //}

    @Override
    public List<Product> findAllProducts(){
        return repo.findAllProducts().stream().map( p -> {
            Double princeImp = p.getPrice() * configProperties;
            
            //Product product = new Product(p.getId(),p.getName(),princeImp.longValue());
            Product product = (Product) p.clone();
            product.setPrice(princeImp.longValue());
            return product;
            //POR REQUEST SCOPE
            //p.setPrice(princeImp.longValue());   
            //return p;
        }).collect(Collectors.toList());
    }

    @Override
    public Product findProductById(Long id){
        return repo.findProductById(id);
    }
}

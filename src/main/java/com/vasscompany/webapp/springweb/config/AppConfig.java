package com.vasscompany.webapp.springweb.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.Resource;

import com.vasscompany.webapp.springweb.repository.IProductRepository;
import com.vasscompany.webapp.springweb.repository.ProductRepositoryJson;



@Configuration
public class AppConfig {

   @Value("classpath:json/product.json")
   private Resource resource;

   @Primary
   @Bean
   public IProductRepository productRepository(){
      return new ProductRepositoryJson(resource);                  
    }

}

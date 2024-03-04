package com.vasscompany.webapp.springweb.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.vasscompany.webapp.springweb.repository.IProductRepository;
import com.vasscompany.webapp.springweb.repository.ProductRepositoryJson;


@Configuration
public class AppConfig {

   @Primary
   @Bean
   public IProductRepository productRepository(){
      return new ProductRepositoryJson();                  
    }

}

package com.demo_spring.service;



import com.demo_spring.entity.Product;

import java.util.List;

public interface ProductService {

    Product postProduct(Product product);

    List<Product> getAllProduct();

    void deteteEmployee(Long id);

    Product getProductById(Long id);

    Product editProduct(long id, Product product);

}
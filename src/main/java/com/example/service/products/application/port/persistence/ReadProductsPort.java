package com.example.service.products.application.port.persistence;

import com.example.service.products.domain.Product;
import com.example.service.products.domain.ProductId;

import java.util.List;
import java.util.Optional;

public interface ReadProductsPort {

//    Boolean existsProductByName(Product Product);
//
//    Boolean existsProductById(ProductId ProductId);

    Optional<Product> fetchById(ProductId ProductId);

//    List<Product> fetchAll();
}

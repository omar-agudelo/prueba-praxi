package com.example.service.products.application.port.persistence;

import com.example.service.products.domain.Product;
import com.example.service.products.domain.ProductId;

import java.util.Optional;

public interface WriteProductsPort {

    Product saveNew(Product Product);


}

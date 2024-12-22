package com.example.service.products.application.usecase;

import com.example.service.products.domain.Product;
import com.example.service.products.domain.ProductId;

public interface FindProductsByIdUseCase {

    Product findById(ProductId productsId);
}

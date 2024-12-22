package com.example.service.products.application.usecase;

import com.example.service.products.domain.Product;

public interface ChangeExistingProductsUseCase {

    Product updateProducts(Product products);
}

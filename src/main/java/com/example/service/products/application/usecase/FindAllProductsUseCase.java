package com.example.service.products.application.usecase;

import com.example.service.products.domain.Product;

import java.util.Collection;

public interface FindAllProductsUseCase {

    Collection<Product> fetchAllPersisted();
}

package com.example.service.products.application.service;

import com.example.service.products.application.port.persistence.ReadProductsPort;
import com.example.service.products.application.usecase.FindAllProductsUseCase;
import com.example.service.products.application.usecase.FindProductsByIdUseCase;
import com.example.service.products.domain.Product;
import com.example.service.products.domain.ProductId;
import com.example.service.products.infrastructure.validator.ObjectValidator;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.Collection;
import java.util.List;

@Service
class FindProductsService implements FindProductsByIdUseCase, FindAllProductsUseCase {

    private final ReadProductsPort readProductsPort;

    FindProductsService(ReadProductsPort readProductsPort) {
        this.readProductsPort = readProductsPort;
    }

    @Override
    public Product findById(ProductId productId) {
        ObjectValidator.validate(productId);
        return readProductsPort.fetchById(productId).orElseThrow(EntityNotFoundException::new);
    }

    @Override
    public Collection<Product> fetchAllPersisted() {
        return List.of();
    }

//    @Override
//    public Collection<Products> fetchAllPersisted() {
//        return readProductsPort.fetchAll();
//    }

}

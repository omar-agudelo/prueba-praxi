package com.example.service.products.application.service;

import com.example.service.products.application.port.persistence.WriteProductsPort;
import com.example.service.products.application.usecase.ChangeExistingProductsUseCase;
import com.example.service.products.domain.Product;
import com.example.service.products.infrastructure.validator.ObjectValidator;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;

@Service
class ChangeExistingProductsService implements ChangeExistingProductsUseCase {

    private final WriteProductsPort writeProductsPort;

    public ChangeExistingProductsService(WriteProductsPort writeProductsPort) {
        this.writeProductsPort = writeProductsPort;
    }

    @Override
    public Product updateProducts(Product products) {
        return null;
    }

//    @Override
//    public Product updateProducts(Product products) {
//        ObjectValidator.validate(products);
//
//        return writeProductsPort.update(Product).orElseThrow(EntityNotFoundException::new);
//    }
}

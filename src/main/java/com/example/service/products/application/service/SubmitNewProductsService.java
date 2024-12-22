package com.example.service.products.application.service;

import com.example.service.products.application.port.persistence.ReadProductsPort;
import com.example.service.products.application.port.persistence.WriteProductsPort;
import com.example.service.products.application.usecase.SubmitNewProductsUseCase;
import com.example.service.products.domain.Product;
import com.example.service.products.infrastructure.validator.ObjectValidator;
import org.springframework.stereotype.Service;

@Service
class SubmitNewProductsService implements SubmitNewProductsUseCase {

    private final WriteProductsPort writeProductsPort;

    private final ReadProductsPort readProductsPort;

    SubmitNewProductsService(WriteProductsPort writeProductsPort,
                             ReadProductsPort readProductsPort) {
        this.writeProductsPort = writeProductsPort;
        this.readProductsPort = readProductsPort;
    }

    @Override
    public Product saveProducts(Product product) {
        ObjectValidator.validate(product);
        return writeProductsPort.saveNew(product);
    }


}

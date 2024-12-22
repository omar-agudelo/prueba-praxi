package com.example.service.products.adapter.entrypoint.api;

import com.example.service.products.adapter.entrypoint.api.model.ProductDto;
import com.example.service.products.adapter.entrypoint.api.model.SaveProductsBodyDto;
import com.example.service.products.application.port.entrypoint.api.ChangeProductsEndpointPort;
import com.example.service.products.application.usecase.ChangeExistingProductsUseCase;
import com.example.service.products.application.usecase.SubmitNewProductsUseCase;
import com.example.service.products.domain.Product;
import com.example.service.products.infrastructure.annotations.Adapter;

@Adapter
class ChangeProductsEndpointAdapter implements ChangeProductsEndpointPort {

    private final SubmitNewProductsUseCase submitNewProductsUseCase;

    private final ChangeExistingProductsUseCase changeExistingProductsUseCase;

    private final ProductsDtoMapper productsDtoMapper;

    ChangeProductsEndpointAdapter(SubmitNewProductsUseCase submitNewProductsUseCase, ChangeExistingProductsUseCase changeExistingProductsUseCase, ProductsDtoMapper productsDtoMapper) {
        this.submitNewProductsUseCase = submitNewProductsUseCase;
        this.changeExistingProductsUseCase = changeExistingProductsUseCase;
        this.productsDtoMapper = productsDtoMapper;
    }


    @Override
    public ProductDto saveProducts(SaveProductsBodyDto saveProductsBodyDto) {
        Product product = productsDtoMapper.toDomainFromSaveBody(saveProductsBodyDto);
        Product savedProducts = submitNewProductsUseCase.saveProducts(product);
        return productsDtoMapper.toDto(savedProducts);
    }


}

package com.example.service.products.adapter.entrypoint.api;

import com.example.service.products.adapter.entrypoint.api.model.ProductDto;
import com.example.service.products.application.port.entrypoint.api.FindProductsEndpointPort;
import com.example.service.products.application.usecase.FindAllProductsUseCase;
import com.example.service.products.application.usecase.FindProductsByIdUseCase;
import com.example.service.products.domain.ProductId;
import com.example.service.products.domain.Product;
import com.example.service.products.infrastructure.annotations.Adapter;

import java.util.Collection;
import java.util.stream.Collectors;

@Adapter
class FindProductsEndpointAdapter implements FindProductsEndpointPort {

    private final FindAllProductsUseCase findAllProductssUseCase;

    private final FindProductsByIdUseCase findProductsByIdUseCase;

    private final ProductsDtoMapper productsDtoMapper;

    FindProductsEndpointAdapter(FindAllProductsUseCase findAllProductsUseCase,
                                FindProductsByIdUseCase findProductsByIdUseCase,
                                ProductsDtoMapper productsDtoMapper) {
        this.findAllProductssUseCase = findAllProductsUseCase;
        this.findProductsByIdUseCase = findProductsByIdUseCase;
        this.productsDtoMapper = productsDtoMapper;
    }

    @Override
    public ProductDto fetchProductById(Integer id) {
        ProductId productId = ProductId.of(id);
        Product foundProduct = findProductsByIdUseCase.findById(productId);
        return productsDtoMapper.toDto(foundProduct);
    }

//    @Override
//    public Collection<ProductDto> fetchAllProductsrs() {
//        return findAllProductsUseCase.fetchAllPersisted()
//                .stream()
//                .map(ProductsDtoMapper::toDto)
//                .collect(Collectors.toUnmodifiableList());
//    }
}

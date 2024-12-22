package com.example.service.products.adapter.persistence;

import com.example.service.products.adapter.persistence.model.ProductData;
import com.example.service.products.application.port.persistence.WriteProductsPort;
import com.example.service.products.domain.Product;
import com.example.service.products.infrastructure.annotations.Adapter;


@Adapter
class WriteProductsAdapter implements WriteProductsPort {

    private final ProductsRepository productRepository;

    private final ProductsJpaMapper productJpaMapper;

    public WriteProductsAdapter(ProductsRepository productRepository, ProductsJpaMapper productJpaMapper) {
        this.productRepository = productRepository;
        this.productJpaMapper = productJpaMapper;
    }

    @Override
    public Product saveNew(Product Product) {
        ProductData ProductData = productJpaMapper.toJpaEntity(Product);
        ProductData ProductSaved = productRepository.save(ProductData);
        return productJpaMapper.toDomain(ProductSaved);
    }




}

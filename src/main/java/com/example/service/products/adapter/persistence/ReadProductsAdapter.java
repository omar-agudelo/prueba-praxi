package com.example.service.products.adapter.persistence;

import com.example.service.products.application.port.persistence.ReadProductsPort;
import com.example.service.products.domain.Product;
import com.example.service.products.domain.ProductId;
import com.example.service.products.infrastructure.annotations.Adapter;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;



@Adapter
class ReadProductsAdapter implements ReadProductsPort {

    private final ProductsRepository productsRepository;

    private final ProductsJpaMapper productsJpaMapper;

    public ReadProductsAdapter(ProductsRepository productsRepository, ProductsJpaMapper productsJpaMapper) {
        this.productsRepository = productsRepository;
        this.productsJpaMapper = productsJpaMapper;
    }

//    @Override
//    public Boolean existsProductsByName(Products Products) {
//        String firstName = ProductsFirstName.apply(Products);
//        String lastName = ProductsLastName.apply(Products);
//        return !ProductsRepository.findByFirstNameAndLastName(firstName, lastName)
//                    .isEmpty();
//    }
//
//    @Override
//    public Boolean existsProductsById(ProductsId ProductsId) {
//        Integer ProductsIdAsInt = ProductsId.intValue();
//        return ProductsRepository.existsById(ProductsIdAsInt);
//    }

    @Override
    public Optional<Product> fetchById(ProductId ProductId) {
        return productsRepository.findById(ProductId.intValue())
                .map(productsJpaMapper::toDomain);
    }

//    @Override
//    public List<Products> fetchAll() {
//        return ProductsRepository.findAll()
//                .stream()
//                .map(ProductsJpaMapper::toDomain)
//                .collect(Collectors.toUnmodifiableList());
//    }
}

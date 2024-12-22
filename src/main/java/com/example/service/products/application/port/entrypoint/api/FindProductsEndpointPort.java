package com.example.service.products.application.port.entrypoint.api;

import com.example.service.products.adapter.entrypoint.api.model.ProductDto;

import java.util.Collection;

public interface FindProductsEndpointPort {

//    Collection<ProductDto> fetchAllProducts();

    ProductDto fetchProductById(Integer id);
}

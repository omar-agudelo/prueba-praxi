package com.example.service.products.application.port.entrypoint.api;

import com.example.service.products.adapter.entrypoint.api.model.ProductDto;
import com.example.service.products.adapter.entrypoint.api.model.SaveProductsBodyDto;

public interface ChangeProductsEndpointPort {

//    ProductDto saveProduct(SaveProductsBodyDto saveProductBodyDto);
//
//    ProductDto updateProduct(Integer id, SaveProductsBodyDto saveProductBodyDto);


    ProductDto saveProducts(SaveProductsBodyDto saveProductsBodyDto);
}

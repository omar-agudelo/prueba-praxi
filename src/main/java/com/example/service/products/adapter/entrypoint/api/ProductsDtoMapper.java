package com.example.service.products.adapter.entrypoint.api;

import com.example.service.products.adapter.entrypoint.api.model.SaveProductsBodyDto;
import com.example.service.products.adapter.entrypoint.api.model.ProductDto;
import com.example.service.products.domain.Product;
import com.example.service.products.domain.ProductId;
import com.example.service.products.infrastructure.annotations.Mapper;

//import static com.example.service.products.domain.ProductsFunctions.*;

@Mapper
class ProductsDtoMapper {

    ProductsDtoMapper() {
        super();
    }

    ProductDto toDto(Product product) {
        return ProductDto.builder()
                .id(Long.valueOf(product.getId().intValue()))
                .nameProduct(product.getNameProduct())
                .price(product.getPrice())
                .promotionPrice(product.getPromotionPrice())
                .build();
    }

    Product toDomainFromSaveBody(SaveProductsBodyDto saveProductsBodyDto) {
        return Product.builder()
                .nameProduct(saveProductsBodyDto.getNameProduct())
                .price(saveProductsBodyDto.getPrice())
                .promotionPrice(saveProductsBodyDto.getPromotionPrice())
                .build();
    }

//    Product toDomainFromSaveBody(Integer ProductsId, SaveProductsBodyDto saveProductsBodyDto) {
//        return Product.builder()
//                .id(ProductsId.of(ProductsId))
//                .fullName(FullName.of(saveProductsBodyDto.getFirstName(), null, saveProductsBodyDto.getLastName()))
//                .phone(Phone.of(saveProductsBodyDto.getPhone()))
//                .build();
//    }
}

package com.example.service.products.adapter.persistence;

import com.example.service.products.adapter.persistence.model.ProductData;
import com.example.service.products.domain.Product;
import com.example.service.products.domain.ProductId;
import com.example.service.products.infrastructure.annotations.Mapper;

@Mapper
class ProductsJpaMapper {

    ProductsJpaMapper() {
        super();
    }

    ProductData toJpaEntity(Product product) {
        return ProductData.builder()
                .id(product.getId().intValue())
                .nameProduct(product.getNameProduct())
                .price(product.getPrice())
                .promotionPrice(product.getPromotionPrice())
                .build();
    }

//    ProductData toJpaEntity(Product Product, ProductData persistedProductData) {
//        return persistedProductData.toBuilder()
//                .firstName(ProductFirstName.apply(Product))
//                .lastName(ProductLastName.apply(Product))
//                .phone(ProductPhoneNumber.apply(Product))
//                .updatedAt(LocalDateTime.now())
//                .build();
//    }

    Product toDomain(ProductData productData) {
        return Product.builder()
                .id(ProductId.of(productData.getId()))
                .nameProduct(productData.getNameProduct())
                .price(productData.getPrice())
                .promotionPrice(productData.getPromotionPrice())
                .build();
    }

}

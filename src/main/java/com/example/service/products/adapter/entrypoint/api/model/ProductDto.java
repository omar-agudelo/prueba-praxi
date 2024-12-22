package com.example.service.products.adapter.entrypoint.api.model;

import com.example.service.products.domain.ProductId;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ProductDto {

    private final Long  id;

    private final String nameProduct;

    private final Long price;

    private final Long promotionPrice;
    ;

}


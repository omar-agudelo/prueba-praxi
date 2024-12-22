package com.example.service.products.domain;

import com.example.service.products.domain.ProductId;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Builder(toBuilder = true)
@Getter(AccessLevel.PUBLIC)
public class Product implements Serializable {

    private final ProductId id;

    @NotNull
    private final String nameProduct;

    @NotNull
    private final Long price;

    @NotNull
    private final Long promotionPrice;

}

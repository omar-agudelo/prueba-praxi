package com.example.service.products.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Value;

import javax.validation.constraints.NotNull;

@Getter(AccessLevel.PACKAGE)
@Value(staticConstructor = "of")
public class ProductId {

    @NotNull
    Integer intValue;

    public Integer intValue() {
        return intValue;
    }
}

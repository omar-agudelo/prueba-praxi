package com.example.service.products.adapter.entrypoint.api.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor(staticName = "of")
public class SaveProductsBodyDto {


    private String nameProduct;

    private Long price;


    private Long  promotionPrice;

}

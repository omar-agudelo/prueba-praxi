package com.example.service.products.adapter.persistence.model;

import com.example.service.products.domain.ProductId;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Getter
@Entity
@Table(name = "Products")
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class ProductData {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;


    @NotNull
    private  String nameProduct;

    @NotNull
    private  Long price;

    @NotNull
    private  Long promotionPrice;

    @NotNull
    private LocalDateTime createdAt;

    @NotNull
    private LocalDateTime updatedAt;
}

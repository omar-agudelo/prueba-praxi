package com.example.service.products.adapter.persistence;

import com.example.service.products.adapter.persistence.model.ProductData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface ProductsRepository extends JpaRepository<ProductData, Integer> {

    //Collection<ProductData> findByFirstNameAndLastName(String firstName, String lastName);
}

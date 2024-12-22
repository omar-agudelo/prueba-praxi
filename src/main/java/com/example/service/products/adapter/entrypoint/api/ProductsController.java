package com.example.service.products.adapter.entrypoint.api;

import com.example.service.products.adapter.entrypoint.api.model.ProductDto;
import com.example.service.products.adapter.entrypoint.api.model.SaveProductsBodyDto;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Collection;

@RestController
@RequestMapping("/products")
class ProductsController {

    private final ChangeProductsEndpointAdapter changeProductsEndpointAdapter;

    private final FindProductsEndpointAdapter findProductsEndpointAdapter;

    ProductsController(ChangeProductsEndpointAdapter changeProductsEndpointAdapter,
                   FindProductsEndpointAdapter findProductsEndpointAdapter) {
        this.changeProductsEndpointAdapter = changeProductsEndpointAdapter;
        this.findProductsEndpointAdapter = findProductsEndpointAdapter;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ProductDto saveProducts(@RequestBody @Valid SaveProductsBodyDto saveProductsBodyDto) {
        return changeProductsEndpointAdapter.saveProducts(saveProductsBodyDto);
    }


    @GetMapping("/{Products_id}")
    @ResponseStatus(HttpStatus.OK)
    public ProductDto fetchProductsById(@PathVariable("Products_id") Integer ProductsId) {
        return findProductsEndpointAdapter.fetchProductById(ProductsId);
    }



//    @GetMapping
//    @ResponseStatus(HttpStatus.OK)
//    public Collection<ProductDto> fetchAllProducts() {
//        return findProductsEndpointAdapter.fetchAllProducts();
//    }

}

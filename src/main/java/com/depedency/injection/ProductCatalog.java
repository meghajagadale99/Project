package com.depedency.injection;

import java.util.List;

public
class ProductCatalog {
    private ProductRepository productRepository;

    public
    ProductCatalog(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public
    void listAllProducts() {
        List<String> allproductName = productRepository.getAllProductName();
    }
}

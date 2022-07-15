package com.depedency.solution;

public
class ProductCatalog {
    public void listAllProducts(){
        ProductRepository productRepository = ProductFactory.create();
        productRepository.getAllProductName();
    }
}

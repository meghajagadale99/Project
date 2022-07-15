package com.depedency.injection;

public
class MainApplication {
    public static
    void main(String[] args) {
        ProductRepository productRepository = ProductFactory.create();
        ProductCatalog productCatalog = new ProductCatalog(productRepository);
        productCatalog.listAllProducts();
    }
}

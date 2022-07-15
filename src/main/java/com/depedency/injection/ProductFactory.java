package com.depedency.injection;

public
class ProductFactory {
    public static
    ProductRepository create() {
        return new SQLProductRepository();
    }
}

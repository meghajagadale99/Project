package com.depedency.solution;

public
class ProductFactory {
    public static ProductRepository create(){
        return new SQLProductRepository();
    }
}

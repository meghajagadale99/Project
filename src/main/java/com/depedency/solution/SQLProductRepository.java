package com.depedency.solution;

import java.util.Arrays;
import java.util.List;

public
class SQLProductRepository implements ProductRepository{

    @Override
    public
    List<String> getAllProductName() {
        return Arrays.asList("create","update","delete");
    }
}

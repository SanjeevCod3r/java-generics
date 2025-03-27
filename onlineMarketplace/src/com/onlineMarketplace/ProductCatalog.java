package com.onlineMarketplace;

import java.util.ArrayList;
import java.util.List;

// Generic product catalog to store multiple types of products
public class ProductCatalog<T extends Product<?>> {
    private List<T> products = new ArrayList<>();

    public void addProduct(T product) {
        products.add(product);
    }

    public List<T> getProducts() {
        return products;
    }
}

package org.trees.product;

import lombok.Data;

import java.util.List;

@Data
public class ProductNode {
    private String gtin;
    private List<Product> products;
    private ProductNode left;
    private ProductNode right;

    public ProductNode(String gtin, List<Product> products) {
        this.gtin = gtin;
        this.products = products;
    }
}

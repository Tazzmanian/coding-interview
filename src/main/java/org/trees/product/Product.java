package org.trees.product;

import lombok.Data;

@Data
public class Product {
    private String productId;
    private String name;
    private Double price;
    private String manufacturerName;
}

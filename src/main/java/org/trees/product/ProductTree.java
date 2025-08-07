package org.trees.product;

import java.util.List;

public class ProductTree {
    private ProductNode root;

    public void insert(String gtin, List<Product> products) {
        ProductNode newNode = new ProductNode(gtin, products);

        if (root == null) {
            root = newNode;
        } else {
            var currentNode = root;
            ProductNode parent;
            while (true) {
                parent = currentNode;
                if (gtin.compareTo(currentNode.getGtin()) < 0) {
                    currentNode = currentNode.getLeft();
                    if (currentNode == null) {
                        parent.setLeft(newNode);
                        return;
                    }
                } else if (gtin.compareTo(currentNode.getGtin()) > 0) {
                    currentNode = currentNode.getRight();
                    if (currentNode == null) {
                        parent.setRight(newNode);
                        return;
                    }
                } else {
                    return;
                }
            }
        }
    }

    public ProductNode find(String gtin) {

        var current = root;
        if (current == null)
            return null;

        while (!current.getGtin().equals(gtin)) {
            if (gtin.compareTo(current.getGtin()) < 0) {
                current = current.getLeft();
            } else {
                current = current.getRight();
            }
            if (current == null) //not found in children
                return null;
        }
        return current;
    }
}

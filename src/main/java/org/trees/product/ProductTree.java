package org.trees.product;

import java.util.List;
import java.util.StringJoiner;

//@Getter
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

    public String inOrderTraversal() {
        StringJoiner joiner = new StringJoiner("->", "[", "]");
        return inOrderTraversal(root, joiner);
    }

    private String inOrderTraversal(ProductNode node, StringJoiner joiner) {
        if (node != null) {
            inOrderTraversal(node.getLeft(), joiner);
            joiner.add(node.getGtin());
            inOrderTraversal(node.getRight(), joiner);
        }

        return joiner.toString();
    }

    public String preOrderTraversal() {
        StringJoiner joiner = new StringJoiner("->", "[", "]");
        return preOrderTraversal(root, joiner);
    }

    private String preOrderTraversal(ProductNode node, StringJoiner joiner) {
        if (node != null) {
            joiner.add(node.getGtin());
            preOrderTraversal(node.getLeft(), joiner);
            preOrderTraversal(node.getRight(), joiner);
        }

        return joiner.toString();
    }

    public String postOrderTraversal() {
        StringJoiner joiner = new StringJoiner("->", "[", "]");
        postOrderTraversal(root, joiner);
        return joiner.toString();
    }

    private void postOrderTraversal(ProductNode node, StringJoiner joiner) {
        if (node == null)
            return ;

        postOrderTraversal(node.getLeft(), joiner);
        postOrderTraversal(node.getRight(), joiner);
        joiner.add(node.getGtin());
    }
}

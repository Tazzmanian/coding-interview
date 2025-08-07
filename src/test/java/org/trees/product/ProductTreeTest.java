package org.trees.product;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ProductTreeTest {

    private ProductTree tree = new ProductTree();

    @Test
    public void test_findNode() {
        Product product1 = new Product();
        Product product2 = new Product();
        Product product3 = new Product();
        Product product4 = new Product();
        Product product5 = new Product();
        Product product6 = new Product();
        Product product7 = new Product();
        Product product8 = new Product();
        Product product9 = new Product();

        tree.insert("04000345706564",
                new ArrayList<>(Arrays.asList(product1)));
        tree.insert("07611400983416",
                new ArrayList<>(Arrays.asList(product2)));
        tree.insert("07611400989104",
                new ArrayList<>(Arrays.asList(product3, product4)));
        tree.insert("07611400989111",
                new ArrayList<>(Arrays.asList(product5)));
        tree.insert("07611400990292",
                new ArrayList<>(Arrays.asList(product6, product7, product8)));
        assertEquals(null, tree.find("07611400983324"));
        tree.insert("07611400983324", new ArrayList<>(Arrays.asList(product9)));
        assertTrue(tree.find("07611400983324") != null);
        assertEquals("07611400983324", tree.find("07611400983324").getGtin());
    }
}
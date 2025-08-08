package org.coding.challenges;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class BasketOptimizedTest {

    BasketOptimized basketOptimized;

    @BeforeEach
    public void setup() {
        basketOptimized = new BasketOptimized();
    }

    @Test
    public void productsOrderedByValue() {
        double[][] myProducts = new double[][]{
                {1, 0.98, 230},
                {2, 0.98, 230},
                {3, 0.48, 75},
                {4, 1.29, 55},
                {5, 1.29, 47},
                {6, 4.86, 14},
                {7, 1.69, 12},
        };

        double[][] mostValueableProducts =
                basketOptimized.fill(myProducts, 4);
        Assertions.assertEquals(590d,
                Arrays.stream(mostValueableProducts).
                        mapToDouble(arr -> arr[2]).sum(), 0);
    }

    @Test
    public void given_productsNotOrderedByValue_return_mostValuables() {
        double[][] myProducts = new double[][]{
                {1, 0.98, 230},
                {2, 1.29, 47},
                {3, 1.69, 12},
                {4, 1.29, 55},
                {5, 0.98, 230},
                {6, 4.86, 14},
                {7, 0.48, 75}
        };

        double[][] mostValuableProducts =
                basketOptimized.fill(myProducts, 4);
        Assertions.assertEquals(590d,
                Arrays.stream(mostValuableProducts).
                        mapToDouble(arr -> arr[2]).sum(), 0);
    }

    @Test
    public void given_productsOrderedByValue_return_mostValuables_v2() {

        double[][] myProducts = new double[][]{
                {1, 0.98, 230},
                {2, 0.98, 230},
                {3, 0.48, 75},
                {4, 1.29, 55},
                {5, 1.29, 47},
                {6, 4.86, 14},
                {7, 1.69, 12}
        };

        double[][] mostValuableProducts =
                basketOptimized.fillV2(myProducts, 4);
        Assertions.assertEquals(590d,
                Arrays.stream(mostValuableProducts).
                        mapToDouble(arr -> arr[2]).sum(), 0);
    }

    @Test
    public void given_productsNotOrderedByValue_return_mostValuables_v2() {

        double[][] myProducts = new double[][]{
                {1, 0.98, 230},
                {2, 1.29, 47},
                {3, 1.69, 12},
                {4, 1.29, 55},
                {5, 0.98, 230},
                {6, 4.86, 14},
                {7, 0.48, 75}
        };

        double[][] mostValuableProducts =
                basketOptimized.fillV2(myProducts, 4);
        Assertions.assertEquals(590d,
                Arrays.stream(mostValuableProducts).
                        mapToDouble(arr -> arr[2]).sum(), 0);
    }

    @Test
    public void given_products_return_theMostValuables() {

        double[][] myProducts = new double[][]{
                {1, 0.98, 230},
                {2, 0.51, 30},
                {3, 0.49, 28},
                {4, 1.29, 55},
                {5, 0.98, 230},
                {6, 4.86, 14},
                {7, 0.48, 75}
        };

        double[][] mostValuableProducts =
                basketOptimized.fillV2(myProducts, 4);
        Assertions.assertEquals(593d,
                Arrays.stream(mostValuableProducts).
                        mapToDouble(arr -> arr[2]).sum(), 0);
    }


}

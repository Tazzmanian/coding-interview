package org.lists;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class ShoppingOptionsTest {

    @Test
    public void test_shoppingOptions() {
        var priceOfJeans = List.of(2, 3);
        var priceOfShoes = List.of(4);
        var priceOfSkirts = List.of(2,3);
        var priceOfTops = List.of(1, 2);
        var options = new ShoppingOptions(priceOfJeans, priceOfShoes, priceOfSkirts, priceOfTops);
        Assertions.assertEquals(4, options.getCombinationsForPrice(10));
    }

    @Test
    public void test_shoppingOptionsBigPrices() {
        var priceOfJeans = List.of(2, 10000, 3);
        var priceOfShoes = List.of(2000002, 4);
        var priceOfSkirts = List.of(2, 3000000, 3);
        var priceOfTops = List.of(1, 2);
        var options = new ShoppingOptions(priceOfJeans, priceOfShoes, priceOfSkirts, priceOfTops);
        Assertions.assertEquals(4, options.getCombinationsForPrice(10));
    }
}
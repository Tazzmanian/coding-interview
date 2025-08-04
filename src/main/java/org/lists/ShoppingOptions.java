package org.lists;

import lombok.RequiredArgsConstructor;

import java.util.List;

//@Data
@RequiredArgsConstructor
public class ShoppingOptions {

    private final List<Integer> jeansPrice;
    private final List<Integer> shoesPrice;
    private final List<Integer> skirtsPrice;
    private final List<Integer> topsPrice;

    public int getCombinationsForPrice(int cost) {
        if (cost < 1 || cost > 1000000000)
            throw new RuntimeException("wrong value for budget");

        var count = 0;

        for (var jeans : jeansPrice) {
            if (jeans > cost)
                continue;
            for (var shoes : shoesPrice) {
                if (jeans + shoes > cost)
                    continue;
                for (var skirt : skirtsPrice) {
                    if (jeans + shoes + skirt > cost)
                        continue;
                    for (var top : topsPrice) {
                        if (jeans + shoes + skirt + top <= cost) {
                            count++;
                        }
                    }
                }
            }
        }

        return count;
    }
}

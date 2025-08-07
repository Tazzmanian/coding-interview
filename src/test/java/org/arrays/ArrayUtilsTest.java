package org.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ArrayUtilsTest {

    @Test
    public void test_right_values() {
        Assertions.assertArrayEquals(new int[]{2, 3},
                ArrayUtils.mostFrequents(new int[]{3, 2, 0, 3, 1, 2}));
        Assertions.assertArrayEquals(new int[]{5},
                ArrayUtils.mostFrequents(new int[]{3, 5, 0, 5, 5, 1, 2}));
        Assertions.assertArrayEquals(new int[]{7},
                ArrayUtils.mostFrequents(new int[]{7}));
    }
}
package org.search;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BinaryTest {

    private final Binary BINARY = new Binary();

    @Test
    public void binarySearch_target_notFound() {
        Assertions.assertFalse(BINARY.search("fin", new String[]{"ada", "fda"}));
        Assertions.assertFalse(BINARY.search("eda",
                new String[]{"ada", "bda", "cda", "dda"}));
    }

    @Test
    public void binarySearch_target_Found() {
        Assertions.assertTrue(BINARY.search("cal",
                new String[]{"ada", "cal", "fda"}));
        Assertions.assertTrue(BINARY.search(21,
                new Integer[]{1, 2, 3, 4, 5, 21}));
        Assertions.assertTrue(BINARY.search(21,
                new Integer[]{3, 7, 9, 13, 18, 21, 41, 52, 81, 97}));
    }
}
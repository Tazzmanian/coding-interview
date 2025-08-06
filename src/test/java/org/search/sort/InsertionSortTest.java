package org.search.sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class InsertionSortTest {

    private final Sort INSERTION = new InsertionSort();

    @Test
    public void test_insertionSort() {
        final int[] numbers = {13, 12, 14, 6, 7};
        final int[] expected = {6, 7, 12, 13, 14};
        INSERTION.sort(numbers);
        assertArrayEquals(expected, numbers);
    }

    @Test
    public void sortingArray() {
        final int[] numbers = {7, 9, 1, 4, 9, 12, 4, 13, -2, 9};
        final int[] expected = {-2, 1, 4, 4, 7, 9, 9, 9, 12, 13};
        INSERTION.sort(numbers);
        assertArrayEquals(expected, numbers);
    }
}
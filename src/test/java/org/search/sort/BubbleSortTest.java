package org.search.sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class BubbleSortTest {

    private final BubbleSort BUBBLE_SORT = new BubbleSort();

    @Test
    public void sortingArrays() {
        final int[] numbers = {6, 4, 9, 5};
        final int[] expected = {4, 5, 6, 9};
        int[] numbersSorted = BUBBLE_SORT.sort(numbers);
        assertArrayEquals(expected, numbersSorted);
    }
    @Test
    public void sortManyElementArray() {
        int[] array = {7, 9, 1, 4, 9, 12, 4, 13, 9};
        final int[] expected = {1, 4, 4, 7, 9, 9, 9, 12, 13};
        array = BUBBLE_SORT.sort(array);
        assertArrayEquals(expected, array);
    }

}
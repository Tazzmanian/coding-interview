package org.sort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class SortUtilsTest {
    @Test
    public void mergeSortedLists() {
        List<Integer> sList1 = Arrays.asList(1,1,2,5,8);
        List<Integer> sList2 = Arrays.asList(3,4,6);
        Assertions.assertEquals("[1, 1, 2, 3, 4, 5, 6, 8]",
                SortUtils.merge_sorted(sList1,sList2).toString());
    }

    @Test
    public void mergeSortedLists2() {
        List<Integer> sList1 = Arrays.asList(2,4,5);
        List<Integer> sList2 = Arrays.asList(1,3,6);
        Assertions.assertEquals("[1, 2, 3, 4, 5, 6]",
                SortUtils.merge_sorted(sList1,sList2).toString());
    }
}
package org.sort;

import java.util.ArrayList;
import java.util.List;

public interface SortUtils {

    static List<Integer> merge_sorted(List<Integer> sList1, List<Integer> sList2) {
        var i1 = 0;
        var i2 = 0;
        List<Integer> mergedSortedList = new ArrayList<>();

        while (i1 < sList1.size() && i2 < sList2.size()) {
            if (sList1.get(i1) < sList2.get(i2)) {
                mergedSortedList.add(sList1.get(i1++));
            } else if (sList1.get(i1) > sList2.get(i2)) {
                mergedSortedList.add(sList2.get(i2++));
            } else {
                mergedSortedList.add(sList1.get(i1++));
                mergedSortedList.add(sList2.get(i2++));
            }
        }

        if (i1 < sList1.size()) {
            mergedSortedList.addAll(sList1.subList(i1, sList1.size()));
        }

        if (i2 < sList2.size()) {
            mergedSortedList.addAll(sList2.subList(i2, sList1.size()));
        }

        return mergedSortedList;
    }
}

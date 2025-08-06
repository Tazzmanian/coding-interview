package org.search;

import java.util.Arrays;

public final class Binary extends Search {
    @Override
    public <T extends Comparable<T>> boolean search(T target, T[] array) {
        var mid = array.length / 2;
        if (mid == 0) {
            return false;
        }
        var result = target.compareTo(array[mid]);
        if (result == 0) {
            return true;
        } else if (result < 0) {
            return search(target, Arrays.copyOfRange(array, 0, mid - 1));
        } else if (result > 0){
            return search(target, Arrays.copyOfRange(array, mid + 1, array.length));
        }

        return false;
    }
}

package org.lists;

import java.util.*;

public interface ListUtils {

    static <E extends Iterable<E>> List<E>  removeDuplicatesAndSort(List<E> l) {
        var set = new LinkedHashSet<>(l);
        List list = new LinkedList<>(set);
        Collections.sort(list);
        return list;
    }
}

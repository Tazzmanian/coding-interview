package org.lists;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

class ListUtilsTest {

    @Test
    public void removeDuplicatesAndSort_shouldRemoveDuplicatesAndSort() {
        List list = new ArrayList<String>() {{
            add("aaaa");
            add("aaaa");
            add("bbbaaaa");
            add("bbbaaaa");
        }};

        var expected = new ArrayList<>() {{
            add("aaaa");
            add("bbbaaaa");
        }};

        assertIterableEquals(expected, ListUtils.removeDuplicatesAndSort(list));
    }
}
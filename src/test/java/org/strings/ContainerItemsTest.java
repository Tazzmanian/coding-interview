package org.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

class ContainerItemsTest {

    @Test
    public void test_numberOfItems() {
        var container = new ContainerItems("|**|*|*");
        Assertions.assertEquals(new ArrayList<Integer>(Arrays.asList(2,3)),
                container.getItems(
                        new ArrayList<Integer>(Arrays.asList(1,1)),
                        new ArrayList<Integer>(Arrays.asList(5,6))
                ));
    }

}
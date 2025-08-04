package org.lists;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CustomLinkedListTest {
    @Test
    public void add_shouldExpandTheLinkedList() {
        CustomLinkedList<String> linkedList = new CustomLinkedList<>();
        linkedList.add("s1");
        linkedList.add("s2");
        linkedList.add("s3");
        linkedList.add("s4");
        Assertions.assertEquals("[s1 -> s2 -> s3 -> s4]", linkedList.toString());
    }

    @Test
    public void reverseLinkedList() {
        CustomLinkedList<String> linkedList = new CustomLinkedList<>();
        linkedList.add("s1");
        linkedList.add("s2");
        linkedList.add("s3");
        linkedList.add("s4");
        linkedList.reverse();
        Assertions.assertEquals("[s4 -> s3 -> s2 -> s1]",
                linkedList.toString());
    }
    @Test
    public void reverseIntegersLinkedList() {
        CustomLinkedList<Integer> linkedList = new CustomLinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.reverse();
        Assertions.assertEquals("[4 -> 3 -> 2 -> 1]",
                linkedList.toString());
    }
}
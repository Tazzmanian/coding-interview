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
}
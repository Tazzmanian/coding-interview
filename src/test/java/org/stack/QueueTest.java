package org.stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class QueueTest {
    Queue<Integer> queue;

    @BeforeEach
    public void Before() {
        queue = new Queue<>();
    }

    @Test
    public void pop_firstElement() {
        queue.add(4);
        queue.add(2);
        queue.add(9);
        Assertions.assertEquals(Integer.valueOf(4), queue.peek());
    }
}
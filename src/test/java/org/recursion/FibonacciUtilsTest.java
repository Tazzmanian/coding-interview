package org.recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FibonacciUtilsTest {
    @Test
    public void test_fibonacciSeries() {
        assertEquals(2, FibonacciUtils.fibonacci(3));
        assertEquals(13, FibonacciUtils.fibonacci(7));
        assertEquals(55, FibonacciUtils.fibonacci(10));
    }
}
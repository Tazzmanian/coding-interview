package org.recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FactorialTest {
    @Test
    public void factorialRecursive() {
        assertEquals(1, Factorial.factorialRecursive(1));
        assertEquals(1, Factorial.factorialRecursive(0));
        assertEquals(6, Factorial.factorialRecursive(3));
        assertEquals(720, Factorial.factorialRecursive(6));
    }

    @Test
    public void factorialIterative() {
        assertEquals(1, Factorial.factorialIterative(1));
        assertEquals(1, Factorial.factorialIterative(0));
        assertEquals(6, Factorial.factorialIterative(3));
        assertEquals(720, Factorial.factorialIterative(6));
    }
}
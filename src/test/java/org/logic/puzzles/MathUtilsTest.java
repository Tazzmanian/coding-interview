package org.logic.puzzles;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MathUtilsTest {

    @Test
    public void notPrimeNumbers() {
        assertFalse(MathUtils.isPrimeNumber(-1));
        assertFalse(MathUtils.isPrimeNumber(625));
        assertFalse(MathUtils.isPrimeNumber(4));
        assertFalse(MathUtils.isPrimeNumber(100));
    }

    @Test
    public void primeNumbers() {
        assertTrue(MathUtils.isPrimeNumber(2));
        assertTrue(MathUtils.isPrimeNumber(3));
        assertTrue(MathUtils.isPrimeNumber(5));
        assertTrue(MathUtils.isPrimeNumber(7));
        assertTrue(MathUtils.isPrimeNumber(73));
    }
}
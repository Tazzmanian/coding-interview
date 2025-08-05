package org.logic.puzzles;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class IsNumberAValidPowerOfBaseTest {

    private final IsNumberAValidPowerOfBase checker = new IsNumberAValidPowerOfBase();

    @Test
    public void testOfWrongReturnValues() {
        assertFalse(checker.apply(6, 2));
        assertFalse(checker.apply(16, 5));
        assertFalse(checker.apply(14, 7));
    }

    @Test
    public void testOfValidReturnValues() {
        assertTrue(checker.apply(243, 3));
        assertTrue(checker.apply(16, 4));
        assertTrue(checker.apply(125, 5));
    }
}
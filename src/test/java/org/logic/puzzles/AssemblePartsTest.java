package org.logic.puzzles;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AssemblePartsTest {
    @Test
    public void test_right_values() {
        assertEquals(58, AssembleParts.minimumTime(4,
                new ArrayList<Integer>(Arrays.asList(8, 4, 6, 12))));
        assertEquals(59, AssembleParts.minimumTime(5,
                new ArrayList<Integer>(Arrays.asList(3, 7, 2, 10, 5))));
    }
}
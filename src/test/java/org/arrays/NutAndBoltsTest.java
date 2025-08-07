package org.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class NutAndBoltsTest {
    @Test
    public void matchNutsAndBoltsTest() {
        char nuts[] = {'$', '%', '&', 'x', '@'};
        char bolts[] = {'%', '@', 'x', '$', '&'};
        NutAndBolts.match(nuts, bolts);
        assertArrayEquals(nuts, bolts);
    }
}
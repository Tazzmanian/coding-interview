package org.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VersionComparatorTest {

    @Test
    public void compare_shouldReturn1_when1greaterThan2() {
        assertEquals(1, VersionComparator.compare("10.1.2", "10.1.1"));
        assertEquals(1, VersionComparator.compare("10.1.2", "10.1.0"));
        assertEquals(1, VersionComparator.compare("10.1.2", "10.1"));
        assertEquals(1, VersionComparator.compare("10.1.2", "10"));
    }

    @Test
    public void compare_shouldReturnMinus1_when2greaterThan1() {
        assertEquals(-1, VersionComparator.compare("10.1.2", "10.1.3"));
        assertEquals(-1, VersionComparator.compare("10.1", "10.1.3"));
        assertEquals(-1, VersionComparator.compare("10", "10.1.3"));
    }

    @Test
    public void compare_shouldReturn0_whenEqual() {
        assertEquals(0, VersionComparator.compare("10.1.2", "10.1.2"));
        assertEquals(0, VersionComparator.compare("10.1.0", "10.1"));
        assertEquals(0, VersionComparator.compare("10.0.0", "10"));
    }
}
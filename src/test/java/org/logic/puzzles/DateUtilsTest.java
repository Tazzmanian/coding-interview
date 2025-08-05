package org.logic.puzzles;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DateUtilsTest {
    @Test
    public void isLeapYear() {
        assertTrue(DateUtils.isLeapYear(400));
        assertTrue(DateUtils.isLeapYear(2000));
        assertTrue(DateUtils.isLeapYear(2020));
    }
    @Test
    public void is_notLeapYear() {
        assertFalse(DateUtils.isLeapYear(401));
        assertFalse(DateUtils.isLeapYear(2018));
    }
}
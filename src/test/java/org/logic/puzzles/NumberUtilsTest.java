package org.logic.puzzles;

import org.apache.commons.lang3.time.StopWatch;
import org.junit.jupiter.api.Test;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

class NumberUtilsTest {

    StopWatch watch = new StopWatch();

    @Test
    public void sumOfEvenNumbers_shouldSumAllEvenNumbers() {
        watch.start();
        assertEquals(42, NumberUtils.sumOfEvenNumbers(12));
        assertEquals(110, NumberUtils.sumOfEvenNumbers(21));
        watch.stop();
        System.out.println("Execution time: " + watch.getTime(TimeUnit.MICROSECONDS) + " ms");
    }

    @Test
    public void sumOfEvenNumbersV2_shouldSumAllEvenNumbers() {
        watch.start();
        assertEquals(42, NumberUtils.sumOfEvenNumbersV2(12));
        assertEquals(110, NumberUtils.sumOfEvenNumbersV2(21));
        watch.stop();
        System.out.println("Execution time: " + watch.getTime(TimeUnit.MICROSECONDS) + " ms");
    }

    @Test
    public void test_right_smallest_values() {
        assertEquals(1000, NumberUtils.getSmallestWithSameNumberOfDigits(4751));
        assertEquals(100, NumberUtils.getSmallestWithSameNumberOfDigits(189));
        assertEquals(10, NumberUtils.getSmallestWithSameNumberOfDigits(37));
        assertEquals(0, NumberUtils.getSmallestWithSameNumberOfDigits(1));
        assertEquals(0, NumberUtils.getSmallestWithSameNumberOfDigits(0));
        assertEquals(-9, NumberUtils.getSmallestWithSameNumberOfDigits(-1));
        assertEquals(-99, NumberUtils.getSmallestWithSameNumberOfDigits(-38));
    }

    @Test
    public void test_wrong_smallest_values() {
        assertNotEquals(1, NumberUtils.getSmallestWithSameNumberOfDigits(8));
        assertNotEquals(2000, NumberUtils.getSmallestWithSameNumberOfDigits(2891));
    }
}
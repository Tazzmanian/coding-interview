package org.logic.puzzles;

import org.apache.commons.lang3.time.StopWatch;
import org.junit.jupiter.api.Test;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
}
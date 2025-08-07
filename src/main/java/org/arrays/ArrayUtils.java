package org.arrays;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public interface ArrayUtils {

    static int[] mostFrequents(int[] ints) {
        if (ints == null || ints.length == 0) {
            return new int[0];
        }
        // Count frequencies
        Map<Integer, Long> freqMap = Arrays.stream(ints)
                .boxed()
                .collect(Collectors.groupingBy(num -> num, Collectors.counting()));

        // Find max frequency
        long maxFreq = freqMap.values().stream()
                .max(Long::compareTo)
                .orElse(0L);

        // Filter keys with max frequency and sort ascending
        return freqMap.entrySet().stream()
                .filter(e -> e.getValue() == maxFreq)
                .map(Map.Entry::getKey)
                .sorted()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}

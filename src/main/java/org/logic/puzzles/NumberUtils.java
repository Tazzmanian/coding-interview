package org.logic.puzzles;

import java.util.function.Predicate;
import java.util.stream.IntStream;

public interface NumberUtils {

    static int sumOfEvenNumbers(int n) {
        return IntStream.rangeClosed(1, n).filter(isEven()::test)
                .sum();
    }

    static int sumOfEvenNumbersV2(int n) {
        return IntStream.iterate(2, x -> x <= n, x -> x + 2).filter(isEven()::test)
                .sum();
    }

    static Predicate<Integer> isEven() {
        return x -> x % 2 == 0;
    }
}

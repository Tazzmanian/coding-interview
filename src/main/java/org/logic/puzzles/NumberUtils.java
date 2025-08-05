package org.logic.puzzles;

import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Collectors;
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

    static int getSmallestWithSameNumberOfDigits(int n) {
        String number = String.valueOf(Math.abs(n));
        if (number.length() == 1 && n >= 0) {
            return 0;
        }
        if (n > 0) {
            return (int) Math.pow(10, number.length() - 1);
        }
        return 1 - (int) Math.pow(10, number.length());
    }

    static String fizzBuzz(int n) {
        return IntStream.rangeClosed(1, n).mapToObj(fizzBuzz()).collect(Collectors.joining(","));
    }

    static IntFunction<String> fizzBuzz() {
        final String BUZZ = "Buzz";
        final String FIZZ = "Fizz";
        final String DASH = "-";
        return x -> {
            StringBuilder sb = new StringBuilder();
            if (x % 5 == 0 && x % 3 == 0) {
                sb.append(FIZZ).append(DASH).append(BUZZ);
            } else if (x % 5 == 0) {
                sb.append(BUZZ);
            } else if (x % 3 == 0) {
                sb.append(FIZZ);
            } else {
                sb.append(x);
            }

            return sb.toString();
        } ;
    }
}

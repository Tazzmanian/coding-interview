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
        return x -> {
            if (x % 5 == 0 && x % 3 == 0) {
                return "Fizz-Buzz";
            } else if (x % 5 == 0) {
                return "Buzz";
            } else if (x % 3 == 0) {
                return "Fizz";
            } else {
                return String.valueOf(x);
            }
        } ;
    }
}

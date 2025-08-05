package org.logic.puzzles;

public interface MathUtils {

    static boolean isPrimeNumber(int number) {
        if (number < 2)
            return false;

        if (number == 2)
            return true;

        for (int div = (number / 2) + 1; div > 1; div--) {
            if (number % div == 0) {
                return false;
            }
        }
        return true;
    }
}

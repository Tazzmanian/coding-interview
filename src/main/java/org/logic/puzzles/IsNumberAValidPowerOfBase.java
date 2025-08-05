package org.logic.puzzles;

import java.util.function.BiFunction;

public class IsNumberAValidPowerOfBase implements BiFunction<Integer, Integer, Boolean> {
    @Override
    public Boolean apply(Integer number, Integer base) {
        return isNumberAValidPowerOfBase(number, base);
    }

    static boolean isNumberAValidPowerOfBase(int number, int base) {
        if (number == 0)
            return true;

        while (number != 1) {
            if (number % base != 0)
                return false;

            number /= base;
        }
        return true;
    }
}

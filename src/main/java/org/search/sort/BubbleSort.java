package org.search.sort;

public final class BubbleSort extends Sort {
    @Override
    public int[] sort(int[] numbers) {

        if (numbers == null) {
            throw new RuntimeException("array not initialized");
        }

        boolean numbersSwapped;
        do {
            numbersSwapped = false;
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    int aux = numbers[i + 1];
                    numbers[i + 1] = numbers[i];
                    numbers[i] = aux;
                    numbersSwapped = true;
                }
            }
        } while (numbersSwapped);

        return numbers;
    }
}

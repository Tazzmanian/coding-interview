package org.sort;

public final class InsertionSort extends Sort {
    @Override
    public int[] sort(int[] numbers) {
        if (numbers == null)
            throw new RuntimeException("numbers not initialized");

        for (int i = 1; i < numbers.length; i++) {
            int key = numbers[i];
            int j = i - 1;
            while (j >= 0 && numbers[j] > key) {
                numbers[j + 1] = numbers[j];
                j = j - 1;
            }
            numbers[j + 1] = key;
        }
        return numbers;
    }
}

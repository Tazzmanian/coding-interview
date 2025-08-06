package org.sort;

public final class QuickSort extends Sort {
    @Override
    public int[] sort(int[] numbers) {

        return quickSort(numbers, 0, numbers.length - 1);
    }

    private int[] quickSort(int[] numbers, int low, int high) {
         if (low < high) {
             int partition_border = partition(numbers, low, high);
             System.out.printf("low bound %d, %d%n", low, partition_border - 1);
             quickSort(numbers, low, partition_border - 1);
             System.out.printf("high bound %d, %d%n", partition_border+1, high);
             quickSort(numbers, partition_border + 1, high);
         }

         return numbers;
    }

    private int partition(int[] numbers, int low, int high) {
        System.out.println("-----------------------");
        System.out.printf("low %d, high %d%n", low, high);
        //element to be placed at right position
        int pivot = numbers[high];
        System.out.printf("Pivot number %d, index %d%n", pivot, high);
        int i = low - 1; //index of smaller element
        System.out.printf("smaller index %d%n", i);
        for (int j = low; j < high; j++) {
            //swap when element smaller than the pivot
            System.out.printf("Condition %d[%d], pivot %d = %b%n", j, numbers[j], pivot, numbers[j] < pivot);
            if (numbers[j] < pivot) {
                i++;
                int aux = numbers[i];
                numbers[i] = numbers[j];
                numbers[j] = aux;
                System.out.printf("internal swap %d[%d] with %d[%d]%n", i, aux, j, numbers[i]);
            }
        }
        numbers[high] = numbers[i + 1];
        numbers[i + 1] = pivot;
        System.out.printf("swap %d[%d] with %d[%d]%n", i + 1, numbers[high], high, numbers[i + 1]);
        return i + 1;
    }
}

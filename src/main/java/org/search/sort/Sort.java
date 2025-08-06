package org.search.sort;

public sealed abstract class Sort permits BubbleSort, InsertionSort, QuickSort {

    abstract public int[] sort(int[] numbers);
}

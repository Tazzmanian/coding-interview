package org.search.sort;

public sealed abstract class Sort permits BubbleSort, InsertionSort {

    abstract public int[] sort(int[] numbers);
}

package org.search.sort;

public sealed abstract class Sort permits BubbleSort {

    abstract public int[] sort(int[] numbers);
}

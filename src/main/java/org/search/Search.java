package org.search;

public sealed abstract class Search permits Binary {

    abstract <T extends Comparable<T>> boolean search(T target, T[] array);
}

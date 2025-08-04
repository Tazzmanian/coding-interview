package org.lists;

import java.util.StringJoiner;

public class CustomLinkedList<T> {
    Node head;

    private class Node {
        Node next;
        final T data;

        Node (T data) {
            this.data = data;
            next = null;
        }
    }

    public void add(T data) {
        var node = new Node(data);
        if (head == null) {
            head = node;
        } else {
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = node;
        }
    }

    @Override
    public String toString() {
        StringJoiner stringJoiner = new StringJoiner(" -> ", "[", "]");
        Node currentNode = head;
        while (currentNode != null) {
            stringJoiner.add(currentNode.data.toString());
            currentNode = currentNode.next;
        }
        return stringJoiner.toString();
    }

}

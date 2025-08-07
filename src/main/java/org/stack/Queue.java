package org.stack;

import java.util.Stack;

public class Queue<T> {

    private Stack<T> inbox;
    private Stack<T> outbox;

    public Queue() {
        inbox = new Stack<>();
        outbox = new Stack<>();
    }


    public void add(T value) {
        //This stack always has the newest elements on top
        inbox.push(value);
    }

    public T peek() {
        fillOutbox();
        return outbox.peek();
    }

    public T poll() {
        fillOutbox();
        return outbox.pop();
    }

    private void fillOutbox() {
        if (outbox.isEmpty()) {
            while (!inbox.isEmpty()) {
                //Filled in inverse order
                outbox.push(inbox.pop());
            }
        }
    }
}

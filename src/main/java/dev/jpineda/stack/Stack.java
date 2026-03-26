package dev.jpineda.stack;

import java.util.ArrayList;
import java.util.List;

public class Stack<T> {
    private final List<T> elements = new ArrayList<>();

    public void push(T element) {
        elements.add(element);
    }

    public boolean isEmpty() {
        return elements.isEmpty();
    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return elements.getLast();
    }

    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return elements.removeLast();
    }

    public void print() {
        System.out.print("Stack: ");
        for (T element : elements) {
            System.out.print(element + ",");
        }
        System.out.println();
    }
}

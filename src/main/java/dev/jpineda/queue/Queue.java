package dev.jpineda.queue;

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class Queue<T> {
    private final LinkedList<T> elements = new LinkedList<>();

    public void enqueue(T element) {
        elements.addLast(element);
    }

    public boolean isEmpty() {
        return elements.isEmpty();
    }

    public T peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return elements.getFirst();
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return elements.removeFirst();
    }

    public void print() {
        System.out.print("Queue: ");
        for (T element : elements) {
            System.out.print(element + ",");
        }
        System.out.println();
    }
}

package dev.jpineda.list;

public class LinkedList<T> {
    private Node<T> head;

    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node<T> current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void print() {
        Node<T> current = head;
        System.out.print("List: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void update(T oldData, T newData) {
        Node<T> current = head;
        while (current != null) {
            if (current.data.equals(oldData)) {
                current.data = newData;
                return;
            }
            current = current.next;
        }
    }

    public void delete(T node) {
        if (head == null) {
            return;
        }
        if (head.data.equals(node)) {
            head = head.next;
            return;
        }
        Node<T> current = head;
        while (current.next != null) {
            if (current.next.data.equals(node)) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }
}

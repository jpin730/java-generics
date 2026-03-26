package dev.jpineda.queue;

public class Main {
    static void main() {
        Queue<Integer> queue = new Queue<>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.print();

        System.out.println(queue.peek());

        System.out.println(queue.dequeue());
        queue.print();

        System.out.println(queue.dequeue());
        queue.print();

        System.out.println(queue.isEmpty());

        System.out.println(queue.dequeue());
        queue.print();

        System.out.println(queue.isEmpty());
    }
}

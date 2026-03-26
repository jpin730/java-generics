package dev.jpineda.list;

public class Main {
    static void main() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.print();

        list.update(2, 20);
        list.print();

        list.delete(20);
        list.print();

        list.add(4);
        list.print();

        list.delete(1);
        list.print();

        list.delete(4);
        list.print();

        list.delete(3);
        list.print();
    }
}

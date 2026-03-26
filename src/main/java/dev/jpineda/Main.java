package dev.jpineda;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main() {
        ArrayList<String> names = new ArrayList<>();

        names.add("John");
        names.add("Jane");

        for (String name : names) {
            System.out.println(name.toUpperCase());
        }

        Box<String> stringBox = new Box<>("John");

        System.out.println("stringBox = " + stringBox);

        Box<Integer> integerBox = new Box<>(0);

        System.out.println("integerBox = " + integerBox);

        Utility.printItem("Hello World!");
        Utility.printItem(10);

        System.out.println(MathUtils.add(5, 10));
        System.out.println(MathUtils.add(5.5, 10.5));

        printList(names);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        printList(numbers);

        sumNumbers(numbers);

        addToList(numbers);

        System.out.println("numbers = " + numbers);
    }

    public static void printList(List<?> list) {
        for (Object item : list) {
            System.out.print(item + ",");
        }
        System.out.println();
    }

    public static void sumNumbers(List<? extends Number> list) {
        double sum = 0;
        for (Number number : list) {
            sum += number.doubleValue();
        }
        System.out.println("Sum: " + sum);
    }

    public static void addToList(List<? super Integer> list) {
        list.add(40);
        list.add(50);

        Object num = list.get(1);

        System.out.println("num = " + num);

    }
}

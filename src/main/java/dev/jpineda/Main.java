package dev.jpineda;

import java.util.ArrayList;

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
    }
}

package dev.jpineda.stack;

public class Main {
    static void main() {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.print();
        
        System.out.println(stack.peek());

        System.out.println(stack.pop());
        stack.print();

        System.out.println(stack.pop());
        stack.print();

        System.out.println(stack.isEmpty());

        System.out.println(stack.pop());
        stack.print();

        System.out.println(stack.isEmpty());
    }
}

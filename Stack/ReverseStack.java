// Reverse a stack using another stack.

import java.util.Stack;

public class ReverseStack {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        Stack<Integer> reverse = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        while (!stack.isEmpty()) {
            reverse.push(stack.pop());
        }

        System.out.println(reverse);
    }
}
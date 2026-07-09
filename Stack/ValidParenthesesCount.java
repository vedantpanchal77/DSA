// Count the number of balanced parentheses pairs using a Stack.

import java.util.Stack;

public class ValidParenthesesCount {

    public static void main(String[] args) {

        Stack<Character> stack = new Stack<>();

        String s = "([)";
        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            if (c == '(' || c == '{' || c == '[') {

                stack.push(c);

            } 

            else {

                if (stack.isEmpty()) {
                    System.out.println("Invalid");
                    return;
                }

                char top = stack.peek();

                if ((c == ')' && top == '(') ||
                    (c == ']' && top == '[') ||
                    (c == '}' && top == '{')) {

                    stack.pop();
                    count++;

                } else {

                    System.out.println("Invalid");
                    return;
                }
            }
        }

        if (!stack.isEmpty()) {
            System.out.println("Invalid");
            return;
        }

        System.out.println("Balanced Pairs = " + count);
    }
}
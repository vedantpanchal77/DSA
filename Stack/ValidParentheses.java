// Check whether the given parentheses string is valid using a Stack.

import java.util.*;

public class ValidParentheses {

    public static void main(String[] args) {

        Stack<Character> stack = new Stack<>();
        String s = "([)";

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            if (c == '(' || c == '{' || c == '[') {

                stack.push(c);

            } else {

                if (stack.isEmpty()) {
                    System.out.println("Invalid");
                    return;
                }

                char top = stack.peek();

                if ((c == ')' && top == '(') ||
                    (c == ']' && top == '[') ||
                    (c == '}' && top == '{')) {

                    stack.pop();

                } else {

                    System.out.println("Invalid");
                    return;
                }
            }
        }

        if (stack.isEmpty()) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }
}
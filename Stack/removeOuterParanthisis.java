import java.util.Stack;

class Solution {

    public String removeOuterParentheses(String s) {

        Stack<Character> stack = new Stack<>();
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            // Opening bracket
            if (c == '(') {

                // Skip outer '('
                if (!stack.isEmpty()) {
                    ans.append(c);
                }

                stack.push(c);
            } else {

                stack.pop();

                // Skip outer ')'
                if (!stack.isEmpty()) {
                    ans.append(c);
                }
            }
        }

        return ans.toString();
    }
}
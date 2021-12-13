package String;

import java.util.Stack;

public class BalancedString {
    public static final String input[] = new String[]{
            "{}()",
            "[{()}]",
            "[[",
            "({()})",
            "{}("
    };

    public static boolean isBalanced(String s) {
        Stack<Integer> stack = new Stack<>();
        int current;

        for (char c : s.toCharArray()) {
            if (c == '{' || c == '[' || c == '(') {
                stack.push((int) c);
            }
            if (c == '}' || c == ']' || c == ')') {
                if (stack.empty())
                    return false;
            }
            if (c == '}') {
                current = stack.pop();
                if ((char) current != '{')
                    return false;
            }
            if (c == ']') {
                current = stack.pop();
                if ((char) current != '[')
                    return false;
            }
            if (c == ')') {
                current = stack.pop();
                if ((char) current != '(')
                    return false;
            }
        }

        return stack.empty();
    }

    public static void main(String[] args) {
        for (int i = 0; i < input.length; i++) {
            System.out.println(input[i] + " " + isBalanced(input[i]));
        }
    }
}

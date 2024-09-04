package stack;

import java.util.Stack;

/*https://leetcode.com/problems/valid-parentheses/*/

public class LCValidParanthesis {

    public static void main(String[] args) {
        System.out.println(isValid("{}()[]()"));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        if (s.length() % 2 != 0) {
            return false;
        }
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(')');
            } else if (c == '{') {
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            } else if (stack.isEmpty() || stack.pop() != c) {
                return false;
            }
        }
        return stack.isEmpty();
    }
}

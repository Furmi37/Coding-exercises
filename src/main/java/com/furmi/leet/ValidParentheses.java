package com.furmi.leet;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        isValid("(){}}{");
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(')
                stack.push(')');
            else if (ch == '[')
                stack.push(']');
            else if (ch == '{')
                stack.push('}');
            else if (stack.isEmpty() || stack.pop() != ch) {
                return false;
            }
        }
        return stack.isEmpty();
    }
}

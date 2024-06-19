package com.furmi.codility;

import java.util.Stack;

public class Brackets {
    public int solution(String S) {
        // Implement your solution here
        Stack<Character> stack = new Stack<>();

        for (char ch : S.toCharArray()){
            if (ch == '{' || ch =='[' || ch =='('){
                stack.push(ch);
            }else {
                if (stack.isEmpty()) return 0;
                char stackTop = stack.peek();
                if (ch == '}' && stackTop != '{') return 0;
                if (ch == ']' && stackTop != '[') return 0;
                if (ch == ')' && stackTop != '(') return 0;
                stack.pop();
            }
        }
        return stack.isEmpty()? 1: 0;
    }
}

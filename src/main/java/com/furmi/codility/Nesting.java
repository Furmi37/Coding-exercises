package com.furmi.codility;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Nesting {
    public int solution(String S) {
        // Implement your solution here
        if (S.length() == 0) return 1;
        else if ( S.length() % 2 ==1)
            return 0;

        Stack<Character> stack = new Stack<>();

        for (int i =0; i < S.length();i++){
            if (S.charAt(i) == '('){
                stack.push(')');
            }else if (S.charAt(i) == ')'){
                if (stack.isEmpty() == true){
                    return 0;
                }else {
                    char temp = stack.pop();
                    if (temp != ')'){
                        return 0;
                    }
                }
            }
        }
        if (!stack.isEmpty())
            return 0;
        else
            return 1;
    }
    public int solution1 (String S){
        Stack<Character> stack = new Stack<>();

        for (char ch : S.toCharArray()){
            if (ch == '('){
                stack.push(ch);
            }else {
                if (stack.isEmpty())return 0;
                stack.pop();
            }
        }
        return stack.isEmpty()? 1 : 0;
    }
}

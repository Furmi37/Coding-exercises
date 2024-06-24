package com.furmi.codilityKurs;

import java.util.Stack;

public class Fish {
    public int solution(int[] A, int[] B) {
        // Implement your solution here
        Stack<Integer> stack = new Stack<>();

        int numAlive = A.length;

        for (int i = 0; i < A.length; i++){
            if (B[i] == 1){
                stack.push(A[i]);
            }
            if (B[i] == 0){
                while (!stack.isEmpty()){
                    if (stack.peek() > A[i]){
                        numAlive--;
                        break;
                    }
                    else if (stack.peek() < A[i]){
                        numAlive--;
                        stack.pop();
                    }
                }
            }
        }
        return numAlive;
    }

}

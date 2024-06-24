package com.furmi.codilityKurs;

import java.util.Stack;

public class StoneWall {
    public int solution(int[] H) {
        // Implement your solution here
        Stack <Integer> stack = new Stack<>();
        int numBlocks = 0;

        for (int i = 0; i < H.length; i++){

            while(stack.isEmpty() == false && stack.peek() > H[i]){
                stack.pop();
            }

            if (stack.isEmpty()){
                numBlocks++;
                stack.push(H[i]);
            }else if (stack.peek() == H[i]){
            }
            else if (stack.peek() < H[i]){
                numBlocks++;
                stack.push(H[i]);
            }
        }
        return numBlocks;
    }
}

package com.furmi.katas;

public class ReversedSequence {
    public static int[] reverse(int n){
        //your code
        int index = 0;
        int [] result = new int[n];
        for (int i = n; i >= 1; i--){
            result[index] = i;
            index++;
        }
        return result;
    }
}

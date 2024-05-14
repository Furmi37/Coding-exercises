package com.furmi.katas;

import java.util.Arrays;

public class FindFirstNonConsecutiveNumber {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,6,7,8};
        System.out.println(find(arr));
    }
    static Integer find(final int[] array) {
        Arrays.sort(array);
        Integer result = 0;
        for (int i = 1; i < array.length; i++){
            if ((array[i] - (array[i-1])) > 1){
                return Integer.valueOf(array[i]);
            }
        }
        return null;
    }
}

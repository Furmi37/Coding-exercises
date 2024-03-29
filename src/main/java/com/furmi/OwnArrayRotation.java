package com.furmi;

import java.util.Arrays;

public class OwnArrayRotation {
    public static void main(String[] args) {
        int [] arr = new int[]{3, 8, 9, 7, 6};
        System.out.println(Arrays.toString(rotate(arr,3)));
    }
    public static int[] rotate (int []arr, int k){
        int temp, prev;

        for (int i = 0; i < k; i++){
            temp = arr[arr.length-1];
            for (int j = 0 ;j < arr.length; j++){
                prev = arr[j];
                arr[j] = temp;
                temp = prev;
            }
        }return arr;
    }
}

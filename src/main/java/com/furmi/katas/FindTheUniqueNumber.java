package com.furmi.katas;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindTheUniqueNumber {
    public static void main(String[] args) {
        double[] doubles = {1, 1, 1, 2, 1, 1};
        double[] doubles1 = {0, 0, 0.55, 0, 0};
        System.out.println(findUniq(doubles1));
    }

    public static double findUniq(double arr[]){
        Arrays.sort(arr);
        if (arr[0]==arr[1]){
            return arr[arr.length-1];
        }else{
            return arr[0];
        }
    }
}

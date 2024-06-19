package com.furmi.codility;

public class MaxProfit {

    public int solution(int[] A) {
        // Implement your solution here
        if (A.length <=1){
            return 0;
        }
        int minPrice = A[0];
        int maxProfit = 0;

        for (int i =0; i < A.length; i++){
            if (A[i] < minPrice){
                minPrice = A[i];
            }else {
                int curProfit = A[i] - minPrice;
                if (maxProfit < curProfit){
                    maxProfit = curProfit;
                }
            }
        }
        if (maxProfit <= 0){
            return 0;
        }
        else {
            return maxProfit;
        }
    }
}

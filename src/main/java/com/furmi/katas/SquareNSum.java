package com.furmi.katas;

public class SquareNSum {
    public static void main(String[] args) {
        int [] n = new int[]{5,-3,4};
        System.out.println(squareSum(n));
    }
    public static int squareSum(int[] n)
    {
        //Your Code
        int sum = 0;
        for (int i =0; i < n.length; i++){
            sum += Math.pow(n[i], 2);
        }
        return sum;
    }
}

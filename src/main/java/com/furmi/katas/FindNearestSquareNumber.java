package com.furmi.katas;

public class FindNearestSquareNumber {
    public static void main(String[] args) {
        System.out.println(nearestSq(9999));
    }
    public static int nearestSq(final int n){
        int sqrt = (int) Math.round(Math.sqrt(n));
        return sqrt * sqrt;
    }
}

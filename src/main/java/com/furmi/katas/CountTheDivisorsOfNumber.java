package com.furmi.katas;

public class CountTheDivisorsOfNumber {
    public static void main(String[] args) {
        System.out.println(numberOfDivisors(4));
    }
    public static long numberOfDivisors(int n) {
        long d = 0;
        for (int i = 1; i <= n; i++){
            if (n % i == 0){
                d++;
            }
        }
        return d;
    }
}

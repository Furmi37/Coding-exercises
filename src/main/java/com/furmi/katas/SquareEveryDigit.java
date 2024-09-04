package com.furmi.katas;

public class SquareEveryDigit {

    public int squareDigits(int n) {
        String res = "";
        String s = String.valueOf(n);
        for (char c : s.toCharArray()){
           int digit = Character.digit(c,10);
           res += digit * digit;
        }
        return Integer.parseInt(res);
    }
}

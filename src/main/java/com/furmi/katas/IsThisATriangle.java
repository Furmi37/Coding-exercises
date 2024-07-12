package com.furmi.katas;

public class IsThisATriangle {
    public static boolean isTriangle(int a, int b, int c){
        if (a < 0 || b < 0 || c < 0){
            return false;
        }
        if (a > b){
            if (a > c) {
                if (a < b+c){
                    return true;
                }else {
                    return false;
                }
            }
        }else if (b > c){
            if (b < a+c){
                return true;
            }else {
                return false;
            }
        }else if (c > a){
            if (c < a+b){
                return true;
            }
        }
        return false;
    }
}

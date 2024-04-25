package com.furmi.katas;

public class IsHeGonnaSurvive {

    public static boolean hero(int bullets, int dragons) {
        if (bullets/2 >= dragons){
            return true;
        }
        return false;
    }
}

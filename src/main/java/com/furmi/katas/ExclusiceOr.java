package com.furmi.katas;

public class ExclusiceOr {
    public static boolean xor(boolean a, boolean b) {
        if ((a == true && b == false)||(a == false && b == true)){
            return true;
        }else {
            return false;
        }


    }
}

package com.furmi.katas;

public class L1SetAlarm {
    public static boolean setAlarm(boolean employed, boolean vacation) {
        // Your code here...
        if( employed == true && vacation == true){
            return false;
        } else if (employed == true && vacation == false) {
            return true;
        }else {
            return false;
        }
    }
}

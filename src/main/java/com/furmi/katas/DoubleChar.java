package com.furmi.katas;

public class DoubleChar {

    public static String doubleChar(String s){
        String result = "";
        for (int i =0; i < s.length();i++){
            result += s.charAt(i);
            for (int j =0; j <1; j++){
                result += s.charAt(i);
            }
        }
        return result;
    }
}

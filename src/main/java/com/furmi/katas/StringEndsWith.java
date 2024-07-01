package com.furmi.katas;

public class StringEndsWith {
    public static boolean solution(String str, String ending) {

        if (ending.length() > str.length()){
            return false;
        }
        if (str.substring(str.length() - ending.length(), str.length()).equals(ending)){
            return true;
        }else {
            return false;
        }
//        return str.endsWith(ending);
    }
}

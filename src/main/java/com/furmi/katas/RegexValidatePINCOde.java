package com.furmi.katas;

public class RegexValidatePINCOde {

    public static boolean validatePin(String pin) {
        // Your code here...
        if (pin.length() == 4 || pin.length() == 6){
            for (char c : pin.toCharArray()){
                if (Character.isLetter(c) || !Character.isDigit(c)){
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}

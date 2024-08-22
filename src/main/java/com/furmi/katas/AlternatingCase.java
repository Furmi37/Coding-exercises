package com.furmi.katas;

public class AlternatingCase {
    public static void main(String[] args) {
        String s = "altERnaTIng cAsE";
        System.out.println(toAlternativeString(s));
    }

    public static String toAlternativeString(String string) {
        // your code here!
        String result = "";
        for (char c : string.toCharArray()) {
            if(Character.isUpperCase(c)) {
                result += Character.toLowerCase(c);
            } else {
                result += Character.toUpperCase(c);
            }
        }
        return result;
    }

}

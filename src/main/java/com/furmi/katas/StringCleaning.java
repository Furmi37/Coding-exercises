package com.furmi.katas;

public class StringCleaning {
    public static void main(String[] args) {
        System.out.println(stringClean("aacz98"));
    }
    static String stringClean(final String text) {

        return text.replaceAll("[a-z]", "");
    }
}

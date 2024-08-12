package com.furmi.katas;

public class DetermineOffspringSex {

    public static String chromosomeCheck(String sperm) {
        // Your code goes here. Have fun!
        String daugther = "Congratulations! You're going to have a daughter.";
        String sohn = "Congratulations! You're going to have a son.";
        return sperm.charAt(sperm.length()-1) == 'X' ? daugther : sohn;
    }
}

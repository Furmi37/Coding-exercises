package com.furmi.katas;

public class ExexAndOhs {
    public static void main(String[] args) {
        String s = "ooxXm";
        System.out.println(getXO(s));
    }
    public static boolean getXO (String str) {
        int x = 0, o = 0;
        // Good Luck!!
        String lowerCase = str.toLowerCase();
        for (int i = 0; i < str.length(); i++){
            if (lowerCase.charAt(i) == 'x'){
                x++;
            }else if (lowerCase.charAt(i) == 'o'){
                o++;
            }
        }
        return x - o == 0;
    }
}

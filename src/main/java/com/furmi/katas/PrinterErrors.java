package com.furmi.katas;

public class PrinterErrors {

    public static String printerError(String s) {
        int error = 0;
        char [] badChars = new char[]{'n','o','p','q','r','s','t','u','w','v','z','y','x'};
        for (int i =0; i < s.length(); i++){
            for (int j =0; j < badChars.length;j++){
                if (s.charAt(i) == badChars[j]){
                    error++;
                }
            }
        }
        return error +"/"+s.length();
//        return s.chars().filter(c -> c > 'm').count() + "/" + s.length();
    }
}

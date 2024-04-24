package com.furmi.katas;

import java.util.stream.IntStream;

public class CorrectMistakesOfTheCharacterRecognitionSoftware {
    public static void main(String[] args) {
        String s = "1F-RUDYARD K1PL1]NG";
        System.out.println(correct(s));
    }
    public static String correct(String string) {
//        char[] chars = string.toCharArray();
//        for (int i = 0; i < string.length(); i++){
//            if (chars[i] == '5'){
//                chars[i] = 'S';
//            }else if (chars[i] == '0'){
//                chars[i] = 'O';
//            }else if (chars[i] == '1'){
//                chars[i] = 'I';
//            }
//        }
//        return new String(chars);
        return string.replace("5","S").replace("0","O").replace("1","I");
    }
}

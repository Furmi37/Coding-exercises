package com.furmi.katas;

public class SentenceSmash {
    public static void main(String[] args) {
        String [] s = new String[]{"hello", "world"};
        smash(s);
    }
    public static String smash(String... words) {
        // TODO Write your code below this comment please
        if (words.length <= 0){
            return "";
        }
        String result = words[0];
        for (int i = 1; i < words.length; i++){
            result += " " + words[i];
        }
        return result;
//        return String.join(" ", words);
    }
}

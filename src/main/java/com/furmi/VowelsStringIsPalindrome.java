package com.furmi;

public class VowelsStringIsPalindrome {
    public static void main(String[] args) {
        System.out.println(stringContainsVowels("Hello"));
        System.out.println(stringContainsVowels("tv"));
        System.out.println("palindrome kajaka" + palindrome("kajaka"));
        System.out.println(isPalindromeString("121211"));
    }
    public static boolean stringContainsVowels(String input) {
        return input.toLowerCase().matches(".*[aeiou].*");
    }
    public static boolean palindrome (String str){

        int len = str.length();
        for (int i = 0; i < len / 2; i++){
            if (str.charAt(i) != str.charAt(len - i - 1)){
                return false;
            }
        }
        return true;
    }
    private static boolean isPalindromeString(String str) {
        if (str == null)
            return false;
        int length = str.length();
        System.out.println(length / 2);
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - i - 1))
                return false;
        }
        return true;
    }

}

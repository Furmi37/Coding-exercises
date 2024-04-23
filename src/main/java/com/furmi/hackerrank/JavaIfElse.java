package com.furmi.hackerrank;

public class JavaIfElse {

    public static void main(String[] args) {
        System.out.println(ifElse(4));
    }

    public static String ifElse(int n) {
        if (n % 2 != 0) {
            return "Weird";
        } else if (n % 2 == 0 && (n > 1 && n < 6)) {
            return "Not Werid";
        } else if (n % 2 == 0 && (n > 5 && n < 21)) {
            return "Weird";
        } else {
            return "Not Weird";
        }
    }
}


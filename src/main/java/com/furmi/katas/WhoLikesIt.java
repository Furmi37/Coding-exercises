package com.furmi.katas;

public class WhoLikesIt {
    public static String whoLikesIt(String... names) {
        //Do your magic here
        int len = names.length;
        if (len == 0) {
            return "no one likes this";
        } else if (len == 1) {
            return names[0] + " likes this";
        } else if (len == 2) {
            return names[0] + " and " + names[1] + " likes this";
        } else if (len == 3) {
            return names[0] + ", " + names[1] + " and " + names[2] + " like this";
        } else {
            return names[0] + ", " + names[1] + " and " + (names.length - 2) + " others like this";
        }

    }
}

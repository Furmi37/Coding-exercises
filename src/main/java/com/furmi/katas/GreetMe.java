package com.furmi.katas;

public class GreetMe {
    public static void main(String[] args) {
        System.out.println(greet("mat"));
    }
    public static String greet(String name){

        return "Hello " + name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase() + "!";
    }

}

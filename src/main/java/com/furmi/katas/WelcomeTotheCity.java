package com.furmi.katas;

public class WelcomeTotheCity {
    public static void main(String[] args) {
        String[] name = new String[]{"John", "Smith"};
        System.out.println(sayHello(name, "Phoenix", "Arizona"));
    }
    public static String sayHello(String [] name, String city, String state){
        //code here
        return "Hello, " + String.join(" ", name) + "! Welcome to " + city + ", " + state + "!";
    }
}

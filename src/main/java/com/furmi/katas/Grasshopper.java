package com.furmi.katas;

public class Grasshopper {

    static String greet(String name, String owner) {
        // Add code here
        return name.equals(owner) ? "Hello boss" : "Hello guest";
    }
}

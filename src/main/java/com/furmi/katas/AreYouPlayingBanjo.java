package com.furmi.katas;

public class AreYouPlayingBanjo {

    public static String areYouPlayingBanjo(String name) {
        // Program me!
        if (name.toLowerCase().charAt(0) == 'r'){
            return name + " plays banjo";
        }
        return name + " does not play banjo";
    }
}

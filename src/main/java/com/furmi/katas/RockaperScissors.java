package com.furmi.katas;

public class RockaperScissors {

    public static String rps(String p1, String p2) {
        String p1Won = "Player 1 won!";
        String p2Won = "Player 2 won!";
        if (p1.equals(p2)) {
            return "Draw!";
        }
        if (p1.equals("scissors") && p2.equals("paper")) {
            return p1Won;
        } else if (p1.equals("paper") && p2.equals("rock")) {
            return p1Won;
        } else if (p1.equals("rock") && p2.equals("scissors")) {
            return p1Won;
        } else {
            return p2Won;
        }
    }
}

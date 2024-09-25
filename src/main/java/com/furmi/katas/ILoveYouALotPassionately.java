package com.furmi.katas;

public class ILoveYouALotPassionately {

    public static String howMuchILoveYou(int nb_petals) {

        //your code here :)
            return switch (nb_petals % 6){
                case 1 -> "i love you";
                case 2 -> "a little";
                case 3 -> "a lot";
                case 4 -> "passionately";
                case 5 -> "madly";
                case 0 -> "not at all";
                default -> "";
            };

    }
}

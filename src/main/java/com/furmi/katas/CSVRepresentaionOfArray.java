package com.furmi.katas;

public class CSVRepresentaionOfArray {

    public static String toCsvText(int[][] array) {

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sb.append(array[i][j]);
                if (j < array[i].length-1) {
                    sb.append(",");
                }
            }
            if (i < array.length-1){
                sb.append("\n");
        }

    }
        return sb.toString();
}
}

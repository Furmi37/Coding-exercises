package com.furmi.katas;

public class PrintingArrayElementsWithCommaDelimiters {

    public static String printArray(Object[] array) {
        String res = "";
        for (int i = 0; i < array.length; i++){
            if (i == array.length-1){
                res += array[i];
            }else{
                res += array[i] + ",";
            }
        }
        return res;
    }
}

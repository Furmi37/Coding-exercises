package com.furmi.katas;

public class ComplementaryDNA {

    public static String makeComplement(String dna) {
        //Your code
        char[] chars = dna.toCharArray();
        for (int i = 0; i < dna.length(); i++){
            if(chars[i] == 'A'){
                chars[i] = 'T';
            }
            else if(chars[i] == 'T'){
                chars[i] = 'A';
            }
            if(chars[i] == 'C'){
                chars[i] = 'G';
            }
            else if(chars[i] == 'G'){
                chars[i] = 'C';
            }
        }
        return new String(chars);

    }

}

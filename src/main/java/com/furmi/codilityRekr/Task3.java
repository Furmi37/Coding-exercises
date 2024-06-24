package com.furmi.codilityRekr;

public class Task3 {
    public static void main(String[] args) {
        String s = "NAABSSAN";
        String s1 = "NAANAAXNABABYNNBZ";
        String s2 = "QABAAAWOBL";
        System.out.println("s -> "+ solution(s));
        System.out.println("s1 -> " + solution(s1));
        System.out.println("s2 -> " + solution(s2));
    }
    public static int solution (String S){
        int numbersOfB =0;
        int numbersOfA =0;
        int numbersOfN =0;

        for (int i =0; i < S.length(); i++){
            if (S.charAt(i) == 'B'){
                numbersOfB++;
            }
            if (S.charAt(i) == 'A'){
                numbersOfA++;
            }
            if (S.charAt(i) == 'N'){
                numbersOfN++;
            }
        }
        int letterB = numbersOfB;
        int letterA = numbersOfA/3;
        int letterN = numbersOfN/2;
        int res = 0;

        while(numbersOfB > 0){
            if (letterA > 0 && letterN >0){
                res++;
                letterB -= 1;
                letterA -= 1;
                letterN -= 1;
            }else{
                break;
            }
        }
            return res;
        }
    }

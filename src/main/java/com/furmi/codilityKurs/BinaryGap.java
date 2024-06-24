package com.furmi.codilityKurs;

public class BinaryGap {
    public static void main(String[] args) {
        System.out.println(solution(15));
    }
    public static int solution(int n) {
        String binary = Integer.toBinaryString(n);

        boolean gapStart = false;
        int max = 0;
        int gapCount = 0;

        for (int i = 0; i < binary.length(); i++){
            if (binary.charAt(i) == '1'){
                max = Math.max(max, gapCount);
                gapStart = true;
                gapCount = 0;
            }else{
                if (gapStart){
                    gapCount++;
                }
            }
        }
        return max;
    }
}

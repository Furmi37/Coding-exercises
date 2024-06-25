package com.furmi.codilityKurs;

public class TieRopes {
    public static void main(String[] args) {
        solution(4, new int[]{1,2,3,4,1,1,3});
    }
    public static int solution(int K, int[] A) {
        // Implement your solution here
        if (A.length == 0){
            return 0;
        }
        int numRopes = 0;
        int currentLengh = 0;

        for (int i = 0; i< A.length; i++){
            currentLengh = currentLengh + A[i];
            if (currentLengh >= K){
                numRopes++;
                currentLengh = 0;
            }
        }
        return numRopes;
    }
}

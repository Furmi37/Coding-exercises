package com.furmi.codilityKurs;

public class CountTriangles {
    public static void main(String[] args) {
        int [] arr = new int[]{10,2,5,1,8,12};
        System.out.println(solution(arr));
    }
    public static int solution(int[] A) {
        // Implement your solution here
        if (A.length ==0){
            return 0;
        }
        int triangles = 0;

        for (int i = 0; i < A.length; i++){
            for (int j = i+1; j<A.length-1;){
                if (A[i] < A[j] + A[j+1]){
                    triangles++;
                }
            }
        }
        return triangles;
    }
}

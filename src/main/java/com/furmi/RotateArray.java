package com.furmi;

import java.util.Optional;

public class RotateArray {
    

    public void rotate(int[] nums, int k) {
        int prev, temp;
        k = k % nums.length;
        for (int i = 0; i < k; i++){
            prev = nums[nums.length-1];
            for (int j = 0; j < nums.length; j++){
                temp = nums[j];
                nums[j] = prev;
                prev = temp;
            }
        }
    }
}

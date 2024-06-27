package com.furmi.leet;

public class FindMinimumOperationsToDivisibleByThree {
    public int minimumOperations(int[] nums) {
    int o = 0;

    for (int i=0; i < nums.length; i++){
        if (nums[i] % 3 != 0){
            if ((nums[i] + 1) % 3 ==0){
                o++;
            } else if ((nums[i] - 1) % 3 ==0) {
                o++;
            }
        }
    }
    return o;
    }
}

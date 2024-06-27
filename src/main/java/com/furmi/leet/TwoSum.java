package com.furmi.leet;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int [] res = new int[2];
        for (int i = 0; i < nums.length; i++){
            for (int j = i +1; j < nums.length; j++){
                if (nums[i] + nums[j]== target){
                    nums[0] = nums[i];
                    nums[1] = nums[j];
                }
            }
        }
        return nums;
    }
}

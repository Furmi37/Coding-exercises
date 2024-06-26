package com.furmi;

import java.util.Arrays;

public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
//        #1
//        for (int i = 0; i < nums.length; i++){
//            for (int j=i+1; j < nums.length; j++){
//                if (nums[i] == nums[j]){
//                    return true;
//                }
//            }
//        }
//        return false;
//    }
        //#2
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }
}

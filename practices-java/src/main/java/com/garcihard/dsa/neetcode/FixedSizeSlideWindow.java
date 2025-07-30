package com.garcihard.dsa.neetcode;

import java.util.ArrayList;
import java.util.List;

public class FixedSizeSlideWindow {

    // 1st attempt
    public static int subArraySum(int[] nums, int k) {

        // [1,2,3,7,4,1] - 3
        // 14

        int l = 0;
        int r = k - 1;

        // [1,2,3] [2,3,7] [3,7,4] [7,4,1]
        // 6 - 
        List<Integer> list = new ArrayList<>();
                
        for (int i = 0; i <= l && l < nums.length - 1; i++ ) {
            int sum = 0;
            l = i;
            while (l <= r) {
                sum += nums[l];
                if (l == r) { 
                    r++;
                    list.add(sum);
                    break;
                }
                l++;
            }
        }

        return list.stream().max(Integer::compareTo).get();
    }
    
}

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

    /* The theory mentioned that the 1st step is to summarize the
     * initial given range of the window.
     */
    public static int slidingWindow(int[] nums, int k) {

        /*
         * Initial given values:
         * nums = [1,2,3,7,4,1]
         * k = 3 
        */
        int maxSum = 0;
        for (int i = 0; i < k; i++) {
            maxSum += nums[i];
        }
        // The expected value will be: 6, for the 1st sublist summize.
        // [1][2][3] -> 6
        int windowSum = maxSum;
        /* 
         * Then we need to iterate by adding a new number to the rigth
         * and removing one on the left..
        */
        for (int r = k; r < nums.length; r++) {
            int l = r - k;
            windowSum += nums[r];
            windowSum -= nums[l];
            maxSum = Math.max(windowSum, maxSum);

            // We can simplify the expression like:
            // windowSum += nums[r] - nums[r - k];
        }

        return maxSum;
    }
    
}

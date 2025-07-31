package com.garcihard.dsa.neetcode;

public class ProductsOfArrayExceptSelf {
    
    // Brute force solution.
    public static int[] productExceptSelf(int[] nums) {

        // given: [1,2,4,6]
        // expected: [48,24,12,8]

        int[] res = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int start = 0;
            int prod = 1;
            while (start < nums.length) {
                if (start == i) {
                    start++;
                    continue;
                }
                prod *= nums[start++];
            }
            res[i] = prod;
        }

        return res;
    }
}

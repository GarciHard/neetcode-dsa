package com.garcihard.dsa.neetcode;

public class FindFirstInASortedArray {
    
    public static int findFirstIndex(boolean[] bool, boolean target) {

        int l = 0;
        int r = bool.length - 1;

        // Given a sorted array, find the first true and return the index.
        // g: [f,f,t,t,t]
        // r: 2

        int firstIndex = -1;
        while (l <= r) {
            int m = (l + r ) / 2 ;

            if (bool[m] == target) {
                firstIndex = m;
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return firstIndex;
    }

    public static int findMinimumRotatedSortedArray(int[] nums) {

        int l = 0;
        int r = nums.length - 1;
        int index = -1;

        while (l<=r) {
            int m = (l+r)/2;

            if (nums[m] <= nums[r]) {
                index = m;
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return index;
    }

}

package com.garcihard.dsa.neetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FindFirstInASortedArrayTest {

    @Test
    public void findFirstTrueTest() {
        boolean[] bool = {false, false, true, true, true};
        boolean target= true;

        int res = 2;

        assertEquals(res, FindFirstInASortedArray.findFirstIndex(bool, target));

        int[] nums = {30, 40, 50, 10, 20};
        int res2 = 3;

        assertEquals(res2, FindFirstInASortedArray.findMinimumRotatedSortedArray(nums));
    }
    
}

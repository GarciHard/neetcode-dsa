package com.garcihard.dsa.neetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BinarySearchTest {

    @Test
    public void binarySearchTest() {
        int[] nums = {1,3,4,6,7,9,12};
        int target = 12;
        int res = 6;

        assertEquals(res, BinarySearch.findANumber(nums, target));
    }
    
}

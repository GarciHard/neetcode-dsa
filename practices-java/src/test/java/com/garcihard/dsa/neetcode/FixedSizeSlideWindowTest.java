package com.garcihard.dsa.neetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FixedSizeSlideWindowTest {

    @Test
    public void fixedSlideWindowTest() {
        int[] arr = {1,2,3,7,4,1};
        int k = 3;
        int res = 14;

        assertEquals(res, FixedSizeSlideWindow.subArraySum(arr, k));
    }

    @Test
    public void slidingWindowTest() {
        int[] arr = {1,2,3,7,4,1};
        int k = 4;
        int res = 16;

        assertEquals(res, FixedSizeSlideWindow.slidingWindow(arr, k));
    }
    
}

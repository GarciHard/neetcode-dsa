package com.garcihard.dsa.neetcode;

import org.junit.jupiter.api.Test;

public class TopKFrequentElementsTest {

    @Test
    public void testTopKElements() {
        int[] nums = {1,2,2,3,3,3};
        int k = 2;

        System.out.println(TopKFrequentElements.topKFrequent(nums, k));
    }
    
}

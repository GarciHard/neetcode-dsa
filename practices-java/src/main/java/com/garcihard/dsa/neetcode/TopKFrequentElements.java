package com.garcihard.dsa.neetcode;

import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TopKFrequentElements {

    public static int[] topKFrequent(int[] nums, int k) {
        // [1, 2, 2, 3, 3, 3] -> length = 6
        Map<Integer, Integer> countNums = new HashMap<>();
        // frequency[length + 1] = 7
        /*
         * 0: []
         * 1: [1]
         * 2: [2]
         * 3: [3]
         * 4: []
         * 5: []
         * 6: []
         */
        List<Integer>[] frequency = new List[nums.length + 1];
        for (int i = 0; i < frequency.length; i++) {
            frequency[i] = new ArrayList<>();
        }
        /*
         * 1: 1
         * 2: 2
         * 3: 3
         */
        for (int num: nums) {
            countNums.put(num, countNums.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry: countNums.entrySet()) {
            frequency[entry.getValue()].add(entry.getKey());
        }
        // k = 2
        int[] res = new int[k];
        int index = 0;
        for ( int i = frequency.length - 1; i > 0 && index < k; i-- ) {
            for (int n: frequency[i]) {
                res[index++] = n;
                if ( index == k) { return res; }
            }
        }
        return res;
    }
}
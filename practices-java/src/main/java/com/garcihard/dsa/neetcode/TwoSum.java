package com.garcihard.dsa.neetcode;

import java.util.HashMap;

public class TwoSum {
    

    // [2, 7, 11, 15]
    // 9
    public static int[] twoSum(int[] numbers, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            
            // 9 - 2 = 7
            // 9 - 7 = 2
            int aux = target - numbers[i];

            // 7 exist as key? NOPE.
            // 2 exist as key? YES.
            if (map.containsKey(aux)) {
                // Return the position of the number that we found in the map and the current index.
                // [0, 1] -> [2, 7]
                return new int[]{ map.get(aux), i };
            }
            
            // Save the number and it's position.
            map.put(numbers[i], i);
        }

        return new int[]{};
    }
}

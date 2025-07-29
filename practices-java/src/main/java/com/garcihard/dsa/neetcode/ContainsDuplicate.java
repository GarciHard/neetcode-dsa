package com.garcihard.dsa.neetcode;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    
    public static boolean containsDuplicateBruteForce(int[] numbers) {
        // Check if the input array is null or has less than 2 elements
        if (numbers == null || numbers.length < 2) {
            return false;
        }
        for (int i = 0; i <= numbers.length - 1; i++) {
            for (int j = i + 1; j <= numbers.length -1; j++) {
                if (numbers[i] == numbers[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean containsDuplicateSet(int[] numbers) {
        if (numbers == null || numbers.length < 2) {
            return false;
        }
        Set<Integer> set = new HashSet<>();
        for (int num : numbers) {
            if (set.contains(num)) {
                return false;
            }
            set.add(num);
        }
        return false;
    }

}
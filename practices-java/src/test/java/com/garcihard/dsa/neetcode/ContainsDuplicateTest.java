package com.garcihard.dsa.neetcode;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ContainsDuplicateTest {


    @Test
    @DisplayName("Test containsDuplicateBruteForce with null or empty array")
    public void testContainsDuplicateBruteForceWithNullOrEmptyArray() {
        String testMessage = "Test contains null or empty array";

        int[] numbers1 = null;
        int[] numbers2 = {};
        int[] numbers3 = {1};

        assertFalse(ContainsDuplicate.containsDuplicateBruteForce(numbers1), testMessage);
        assertFalse(ContainsDuplicate.containsDuplicateBruteForce(numbers2), testMessage);
        assertFalse(ContainsDuplicate.containsDuplicateBruteForce(numbers3), testMessage);
    }

    @Test
    @DisplayName("Test containsDuplicateBruteForce with no duplicates")
    public void testContainsDuplicateBruteForce() {
        String testMessage = "Test does not contain duplicates";

        int[] numbers1 = {1, 2, 3, 4, 5};
        int[] numbers2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] numbers3 = {10, 20, 30, 40, 50};

        assertFalse(ContainsDuplicate.containsDuplicateBruteForce(numbers1), testMessage);
        assertFalse(ContainsDuplicate.containsDuplicateBruteForce(numbers2), testMessage);
        assertFalse(ContainsDuplicate.containsDuplicateBruteForce(numbers3), testMessage);
    }

    @Test
    @DisplayName("Test containsDuplicateBruteForce with duplicates")
    public void testContainsDuplicateBruteForceWithDuplicates() {
        String testMessage = "Test contains duplicates";

        int[] numbers1 = {1, 2, 3, 3};
        int[] numbers2 = {4, 5, 6, 6, 7};
        int[] numbers3 = {8, 8, 9, 10, 11};

        assertTrue(ContainsDuplicate.containsDuplicateBruteForce(numbers1), testMessage);
        assertTrue(ContainsDuplicate.containsDuplicateBruteForce(numbers2), testMessage);
        assertTrue(ContainsDuplicate.containsDuplicateBruteForce(numbers3), testMessage);
    }

    
}

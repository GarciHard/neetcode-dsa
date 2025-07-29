package com.garcihard.dsa.neetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MiddleOfAListTest {

    @Test
    public void middleOfAListTest() {
        int[] odd = {1, 2, 3, 4, 5};
        int oddRes = 3;
        int[] even = {1, 2, 3, 4, 5, 6};
        int evenRes = 4;

        assertEquals(oddRes, MiddleOfAList.middleIndexOfList(odd));
        assertEquals(evenRes, MiddleOfAList.middleIndexOfList(even));
    }
    
}

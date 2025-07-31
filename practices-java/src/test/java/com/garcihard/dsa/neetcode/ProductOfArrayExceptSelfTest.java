package com.garcihard.dsa.neetcode;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class ProductOfArrayExceptSelfTest {
    
    @Test
    public void productExceptSelfTest() {
        int[] arr = {1,2,4,6};
        int[] res = {48,24,12,8};

        assertArrayEquals(res, ProductsOfArrayExceptSelf.productExceptSelf(arr));
    }
}

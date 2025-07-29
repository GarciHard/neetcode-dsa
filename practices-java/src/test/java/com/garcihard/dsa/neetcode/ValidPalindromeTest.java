package com.garcihard.dsa.neetcode;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class ValidPalindromeTest {

    @Test
    public void validPalindromeTest() {
        String word = "A man, a plan, a canal: Panama";

        assertTrue(ValidPalindrome.isPalindrome(word));
    }
    
}

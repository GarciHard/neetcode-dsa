package com.garcihard.dsa.neetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class LongestSubstringNoRepeatingCharactersTest {

    @Test
    public void longestSubstringNoRepeatCharsTest() {
        String s = "abccabcabcc";
        int res = 3;
        assertEquals(res, LongestSubstringNoRepeatingCharacters.findLongestSubstring(s));

        String a = "abcdbea";
        int resA = 5;
        assertEquals(resA, LongestSubstringNoRepeatingCharacters.findLongestSubstring(a));
    }
    
}

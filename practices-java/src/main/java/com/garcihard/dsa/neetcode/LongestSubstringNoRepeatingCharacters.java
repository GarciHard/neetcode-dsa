package com.garcihard.dsa.neetcode;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringNoRepeatingCharacters {
    
    public static int findLongestSubstring(String s) {

        int l = 0, r = 0;
        int longest = 0; // To save the maximum value at any sliding moment.
        // Use of Set to validate duplicates.
        Set<Character> noDuplicates = new HashSet<>();       
        
        // Iterate from rigth to string length
        while ( r < s.length()) {
            // Pick the character at r.
            char current = s.charAt(r);
            // If no duplicate, we add to the list.
            if (!noDuplicates.contains(current)) {
                noDuplicates.add(current);
                // Calculate the maximum from the r current position minus l.
                longest = Math.max(longest, r - l + 1);
                r++;
            } else { // If we find a duplicate, we delete the element at l until we remove the duplicate.
                noDuplicates.remove(s.charAt(l));
                l++;
            }
        }
        
        return longest;
    }
}

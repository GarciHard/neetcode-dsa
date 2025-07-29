package com.garcihard.dsa.neetcode;

public class ValidPalindrome {


    // A man, a plan, a canal: Panama
    public static boolean isPalindrome(String word) {
        int left = 0;
        int rigth = word.length() - 1; // 30

        while (left < rigth) {
            
            // Clean the string
            while (left < rigth && !Character.isAlphabetic(word.charAt(left))) { left++; }
            while (left < rigth && !Character.isAlphabetic(word.charAt(rigth))) { rigth--; }

            if (Character.toLowerCase(word.charAt(left)) != Character.toLowerCase(word.charAt(rigth))) {
                return false;
            }

            left++;
            rigth--;
        }

        return true;
    }
    
}

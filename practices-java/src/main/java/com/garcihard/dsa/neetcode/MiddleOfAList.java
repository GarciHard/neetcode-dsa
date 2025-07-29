package com.garcihard.dsa.neetcode;

public class MiddleOfAList {

    // [1, 2 , 3, 4, 5] - odd - middle -> 3
    // [1, 2, 3, 4, 5, 6] - even - second middle index -> 4 
    public static int middleIndexOfList(int[] list) {
        int slow = 0;
        int fast = 0;

        while ( fast < list.length - 1 ) {
            slow++;
            fast += 2;
        }

        return list[slow];
    }
    
}

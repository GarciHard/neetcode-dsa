package com.garcihard.dsa.neetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

public class GroupAnagramsTest {

    @Test
    public void singleElementAnagramTest() {
        String[] oneElement = {"x"};
        String[] emptyElement = {""};

        List<List<String>> oneElementRes = List.of(List.of("x"));
        List<List<String>> oneElementList = GroupAnagrams.groupAnagrams(oneElement);

        List<List<String>> emptyElementRes = List.of(List.of(""));
        List<List<String>> emptyElementList = GroupAnagrams.groupAnagrams(emptyElement);


        assertEquals(oneElementRes, oneElementList);
        assertEquals(emptyElementRes, emptyElementList);
    }

    @Test
    public void multipleElementsAnagramTest() {
        String[] strs = {"act", "pots", "tops", "cat", "stop", "hat"};

        System.out.println(GroupAnagrams.groupAnagrams(strs).toString());
    }

    @Test
    public void multipleElementsAnagramTest2() {
        String[] strs = {"act", "pots", "tops", "cat", "stop", "hat"};

        System.out.println(GroupAnagrams.groupAnagramUsingSort(strs).toString());
    }

    @Test
    public void multipleElementsAnagramTest3() {
        String[] strs = {"act", "pots", "tops", "cat", "stop", "hat"};

        System.out.println(GroupAnagrams.groupAnagramUsingCount(strs).toString());
    }
    
}
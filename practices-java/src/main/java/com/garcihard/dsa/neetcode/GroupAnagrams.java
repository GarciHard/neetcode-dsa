package com.garcihard.dsa.neetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {

    public static List<List<String>> groupAnagrams(String[] strs) {
        
        if (strs.length == 1) {
            return List.of(List.of(strs[0]));
        }

        // [act, pots, tops, cat, stop, hat]
        // [act, cat, hat, pots, stop, tops]
        // [act, act, ath, opst, opst, opst]

        // act -> [act, cat]

        List<List<String>> res = new ArrayList<>();
        HashMap<String, List<String>> wordIndex = new HashMap<>();

        // cat
        // act
        for (int i = 0; i < strs.length; i++) {
            //[c][a][t]
            //[a][c][t]
            char[] charSortArray = strs[i].toCharArray();
            //[a][c][t]
            //[a][c][t]
            Arrays.sort(charSortArray);
            //act
            //act
            String sortedWord = new String(charSortArray);

            // YES
            // NO
            if (wordIndex.containsKey(sortedWord)) {
                List<String> aux = wordIndex.get(sortedWord);
                aux.add(strs[i]);
                wordIndex.put(sortedWord, aux);
                continue;
            }

            //{ act: act }
            wordIndex.put(sortedWord, new ArrayList<String>(Arrays.asList(strs[i])));
        }

        if (!wordIndex.isEmpty()) {
            for (List<String> element : wordIndex.values()) {
                res.add(element);
            }
        }

        return res;
    }

    public static List<List<String>> groupAnagramUsingSort(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        
        for (String str : strs) {
            char[] sortedCharArray = str.toCharArray();
            Arrays.sort(sortedCharArray);
            String sortedWord = new String(sortedCharArray);
            map.putIfAbsent(sortedWord, new ArrayList<>());
            map.get(sortedWord).add(str);
        }

        return new ArrayList<>(map.values());
    }

    public static List<List<String>> groupAnagramUsingCount(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        
        for (String str : strs) {
            int[] charCount = new int[26]; // Assuming only lowercase letters a-z
            for (char c : str.toCharArray()) {
                charCount[c - 'a']++;
            }
            String key = Arrays.toString(charCount);
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(str);
        }

        return new ArrayList<>(map.values());
    }
    
}

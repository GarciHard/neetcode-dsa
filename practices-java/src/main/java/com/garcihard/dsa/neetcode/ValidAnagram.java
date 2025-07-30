package com.garcihard.dsa.neetcode;

public class ValidAnagram {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        for (int i = 0; i <= s.length() - 1; i++) {
            if (t.contains(String.valueOf(s.charAt(i)))) {
                return false;
            }
        }

        return true;
    }

    public boolean isAnagramUsingSort(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        java.util.Arrays.sort(sArray);
        java.util.Arrays.sort(tArray);

        return java.util.Arrays.equals(sArray, tArray);
    }

    public boolean isAnagramUsingHashMap(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }


        //racecar
        //carrace

        // r:2
        // a:2
        // c:2
        // e:1
        java.util.Map<Character, Integer> charCountMap = new java.util.HashMap<>();
        for (char c : s.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // r:0
        // a:0
        // c:0
        // e:0
        for (char c : t.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) - 1);
        }


        for (int count : charCountMap.values()) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }

    public boolean isAnagramUsingStreams(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        java.util.Map<Character, Long> sCount = s.chars()
                .mapToObj(c -> (char) c)
                .collect(java.util.stream.Collectors.groupingBy(c -> c, java.util.stream.Collectors.counting()));

        java.util.Map<Character, Long> tCount = t.chars()
                .mapToObj(c -> (char) c)
                .collect(java.util.stream.Collectors.groupingBy(c -> c, java.util.stream.Collectors.counting()));

        return sCount.equals(tCount);
    }

    public boolean isAnagramUsingLambda(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        java.util.Map<Character, Integer> charCountMap = new java.util.HashMap<>();
        s.chars().forEach(c -> charCountMap.merge((char) c, 1, Integer::sum));
        t.chars().forEach(c -> charCountMap.merge((char) c, -1, Integer::sum));

        return charCountMap.values().stream().allMatch(count -> count == 0);
    }

}
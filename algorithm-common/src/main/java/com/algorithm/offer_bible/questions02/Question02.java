package com.algorithm.offer_bible.questions02;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Question02 {

    public boolean CheckPermutation(String s1, String s2) {
        if (s1 == null && s2 == null) {
            return true;
        }
        if (s1 != null && s2 == null) {
            return false;
        }
        if (s1 == null && s2 != null) {
            return false;
        }
        if (s1.length() != s2.length()) {
            return false;
        }

        Map<Character, Integer> map1 = mapData(s1);
        Map<Character, Integer> map2 = mapData(s2);
        if (map1.size() != map2.size()) {
            return false;
        }
        Set<Character> key1 = map1.keySet();
        Set<Character> key2 = map2.keySet();

        Set<Character> sets = new HashSet<>();
        sets.addAll(key1);
        sets.addAll(key2);

        for (Character item : sets) {
            Integer value1 = map1.get(item);
            if (value1 == null) {
                return false;
            }
            Integer value2 = map2.get(item);
            if (value2 == null) {
                return false;
            }
            if (value2 != value1) {
                return false;
            }
        }
        return true;
    }

    private Map<Character, Integer> mapData(String s1) {
        char[] chars = s1.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (char item : chars) {
            Integer integer = map.get(item);
            if (integer == null) {
                integer = 1;
            } else {
                integer++;
            }
            map.put(item, integer);
        }
        return map;
    }

    /**
     * todo: 9/18/22 10:23 AM 九师兄
     * 链接：https://leetcode.cn/problems/check-permutation-lcci/solution/pan-ding-shi-fou-hu-wei-zi-fu-zhong-pai-dmkmc/
     **/
    public boolean CheckPermutationv2(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        int[] table = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            int charIndex = s1.charAt(i) - 'a';
            table[charIndex]++;
        }
        for (int i = 0; i < s2.length(); i++) {
            int charIndex = s2.charAt(i) - 'a';
            // todo: 9/18/22 10:26 AM 重点是这个 如果同一个位置的字符出现多次 那么最终还是会
            // todo: 9/18/22 10:26 AM 一直减到0
            table[charIndex]--;
            if (table[charIndex] < 0) {
                return false;
            }
        }
        return true;
    }

}

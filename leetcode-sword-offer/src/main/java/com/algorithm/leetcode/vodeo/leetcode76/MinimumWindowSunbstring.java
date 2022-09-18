package com.algorithm.leetcode.vodeo.leetcode76;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-12-20 21:54
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class MinimumWindowSunbstring {

    public String minWindow(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : t.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int left = 0, minStart = 0, minLen = Integer.MAX_VALUE, count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                if (map.get(c) > 0) {
                    count++;
                }
                map.put(c, map.get(c) - 1);
            }
            while (count == t.length()) {
                if (i - left + 1 < minLen) {
                    minLen = i - left + 1;
                    minStart = left;
                }
                char leftChar = s.charAt(left);
                if (map.containsKey(leftChar)) {
                    map.put(leftChar, map.get(leftChar) + 1);
                    if (map.get(leftChar) > 0) {
                        count--;
                    }
                }
                left++;
            }
        }
        if (minLen == Integer.MAX_VALUE) return "";
        return s.substring(minStart, minStart + minLen);
    }

}

package com.algorithm.leetcode.swordoffer.offer48;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-12-19 21:11
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description: 剑指 Offer 48. 最长不含重复字符的子字符串
 */
public class MaxNorepeatSubChars {


    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() < 1) {
            return 0;
        }
        Set<String> set = new HashSet<>();
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                char ch = s.charAt(j);
                // 如果添加成功证明没有重复
                if (set.add(ch + "_")) {
                    max = Math.max(max, set.size());
                } else {
                    max = Math.max(max, set.size());
                    set.clear();
                    break;
                }
            }

        }
        return max;
    }

    /**
     * 优化一下代码
     *
     * @param s
     * @return
     */
    public int lengthOfLongestSubstring1(String s) {
        if (s == null || s.length() < 1) {
            return 0;
        }
        LinkedList<String> list = new LinkedList<>();
        int max = 0;
        int start = 0;
        int end = 0;
        while (end < s.length()) {
            char ch = s.charAt(end);
            // 如果添加成功证明没有重复
            String newChar = ch + "_";
            // 如果包含
            if (list.contains(newChar)) {
                max = Math.max(max, list.size());
                while (!list.isEmpty() && list.contains(newChar)) {
                    list.removeFirst();
                }
                list.add(newChar);
                start++;
            } else {
                // 不包含 那么就是可以继续加入
                list.add(newChar);
                max = Math.max(max, list.size());
            }

            end++;
        }
        return max;
    }




    /**
     * hashmap方式  双指针 非常巧妙
     *
     * @param s
     * @return
     */
    public int lengthOfLongestSubstring2(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int left = -1;
        int right = 0;
        int ans = 0;
        for (; right < s.length(); right++) {
            char c = s.charAt(right);
            if (map.containsKey(c)) {
                left = Math.max(left, map.get(c));
            }
            map.put(c, right);
            ans = Math.max(ans, right - left);
        }
        return ans;
    }

    /**
     * set 方式
     *
     * @param s
     * @return
     */
    public int lengthOfLongestSubstring3(String s) {
        Set<Character> set = new HashSet<>();
        int left = 0, res = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            while (!set.add(c)) {
                set.remove(s.charAt(left++));
            }
            res = Math.max(res, i - left + 1);
        }
        return res;
    }




}

package com.algorithm.swordoffer.offer159;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-12-20 17:09
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class MaxSubStringRepeat {

    public int lengthOfLongestSubstringTwoDistinct(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int left = 0;
        int right = 0;
        int ans = 0;
        for (; right < s.length(); right++) {
            char c = s.charAt(right);
            map.put(c, map.getOrDefault(c, 0) + 1);
            // 把map变成valid 符合条件的，不符合的把左边的left的c吐出来
            while (map.size() > 2) {
                char mc = s.charAt(left);
                map.put(mc, map.get(mc) - 1);
                if (map.get(mc) == 0) {
                    map.remove(mc);
                }
                left++;
            }

            // 现在map符合条件了 统计结果
            ans = Math.max(ans, right - left + 1);
        }
        return ans;
    }
}

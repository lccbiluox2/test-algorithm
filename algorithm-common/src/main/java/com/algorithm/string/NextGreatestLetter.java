package com.algorithm.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/***
 * todo: 九师兄  2023/7/2 14:57
 *
 * https://leetcode.cn/problems/find-smallest-letter-greater-than-target/description/
 * 744. 寻找比目标字母大的最小字母
 */
public class NextGreatestLetter {

    /***
     * todo: 九师兄  2023/7/2 15:05
     * 测试点：寻找比目标字母大的最小字母
     * 使用暴力查看
     *
     * 【算法】744. 寻找比目标字母大的最小字母
     * https://blog.csdn.net/qq_21383435/article/details/131501253
     */
    public char nextGreatestLetterV1(char[] letters, char target) {
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < letters.length; i++) {
            if (target < letters[i]) {
                list.add(letters[i]);
            }
        }
        Collections.sort(list);
        if (list.isEmpty()) {
            return letters[0];
        }
        return list.get(0);
    }


    public char nextGreatestLetterV2(char[] letters, char target) {
        Character minChar = null;
        for (int i = 0; i < letters.length; i++) {
            if (target < letters[i]) {
                if (minChar == null) {
                    minChar = letters[i];
                    continue;
                }
                if (letters[i] < minChar) {
                    minChar = letters[i];
                }
            }
        }
        if (minChar == null) {
            return letters[0];
        }
        return minChar;
    }

}

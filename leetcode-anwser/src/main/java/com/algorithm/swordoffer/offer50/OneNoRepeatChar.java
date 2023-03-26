package com.algorithm.swordoffer.offer50;

import java.util.Arrays;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-11-27 20:21
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description: 找出不重复的字符串
 */
public class OneNoRepeatChar {

    /**
     * 找重复
     */
    public char firstUniqChar(String s) {
        int length = s.length();
        char[] chars = s.toCharArray();

        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (chars[i] == chars[j]) {
                    return chars[i];
                }
            }
        }

        char c = ' ';
        return c;
    }

    /**
     * 自己写的，想试试替换的，但是时间复杂度是O^2
     * 试试替换
     */
    public char firstUniqChar1(String s) {
        int length = s.length();
        char[] chars = s.toCharArray();

        for (int i = 0; i < length; i++) {
            if (chars[i] == ' ') {
                continue;
            }
            boolean flag = false;
            for (int j = i + 1; j < length; j++) {
                if (chars[i] == chars[j]) {
                    chars[j] = ' ';
                    flag = true;
                }
                System.out.println(Arrays.toString(chars));
            }
            if (flag) {
                chars[i] = ' ';
            }
        }

        for (int i = 0; i < length; i++) {
            if (chars[i] != ' ') {
                return chars[i];
            }
        }

        char c = ' ';
        return c;
    }

    public char firstUniqChar2(String s) {
        if (s.equals("")) return ' ';
        //创建‘a'-'z'的字典
        int[] target = new int[26];
        //第一次遍历，将字符统计到字典数组
        for (int i = 0; i < s.length(); i++) {
            target[s.charAt(i) - 'a']++;
        }
        //第二次遍历，从字典数组获取次数
        for (int i = 0; i < s.length(); i++) {
            if (target[s.charAt(i) - 'a'] == 1) return s.charAt(i);
        }

        return ' ';
    }


    public char firstUniqChar3(String s) {
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            //首次出现的位置是当前位置，且后面没有再出现这个字符
            if (s.indexOf(ch) == i && s.indexOf(ch, i + 1) == -1)
                return s.charAt(i);
        }
        return ' ';
    }

    /**
     * Java 第一次出现的位置==最后出现的位置
     * @param s
     * @return
     */
    public char firstUniqChar4(String s) {
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            // 第一次出现的位置就是最后出现的位置
            if (s.indexOf(ch[i]) == s.lastIndexOf(ch[i])) {
                return ch[i];
            }
        }
        return ' ';
    }
}

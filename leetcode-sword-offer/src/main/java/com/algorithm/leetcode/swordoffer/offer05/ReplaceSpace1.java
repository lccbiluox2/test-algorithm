package com.algorithm.leetcode.swordoffer.offer05;

import com.algorithm.leetcode.swordoffer.offer24.Solution;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-11-26 15:55
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class ReplaceSpace1 {

    public String replaceSpace(String s) {
        String ss = s.replaceAll(" +", "%20");
        return ss;
    }


    public String replaceSpace1(String s) {
        String ss = s.replace(" ", "%20");
        return ss;
    }

    public String replaceSpace2(String toString) {
        int length = toString.length();
        StringBuilder builder = new StringBuilder(length * 2);
        for (int i = 0; i < length; i++) {
            char c = toString.charAt(i);
            if (c == ' ') {
                builder.append("%20");
            } else {
                builder.append(c);
            }
        }
        return builder.toString();
    }

    public String replaceSpace3(String s) {
        int length = s.length();
        char[] array = new char[length * 3];
        int size = 0;
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                array[size++] = '%';
                array[size++] = '2';
                array[size++] = '0';
            } else {
                array[size++] = c;
            }
        }
        String newStr = new String(array, 0, size);
        return newStr;
    }

}

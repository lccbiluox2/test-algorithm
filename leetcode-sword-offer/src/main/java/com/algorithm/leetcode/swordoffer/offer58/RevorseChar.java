package com.algorithm.leetcode.swordoffer.offer58;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-11-26 17:35
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description: 剑指 Offer 58 - II. 左旋转字符串
 * 字符串的左旋转操作是把字符串前面的若干个字符转移到字符串的尾部。请定义一个函数实现字符串左旋转操作的功能。比如，输入字符串"abcdefg"和数字2，该函数将返回左旋转两位得到的结果"cdefgab"。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/zuo-xuan-zhuan-zi-fu-chuan-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class RevorseChar {

    public String reverseLeftWords(String s, int n) {
        // 长度大于n不需要反正
        if (n > s.length()) {
            return s;
        }
        String right = s.substring(0, n);
        String left = s.substring(n, s.length());
        return left + right;
    }

    /**
     * abcde  2
     *
     * @param s
     * @param n
     * @return
     */
    public String reverseLeftWords1(String s, int n) {
        int length = s.length();
        if (n > length) {
            return s;
        }
        char[] newChar = new char[length];
        int count = 0;
        for (int i = n; i < length; i++) {
            newChar[i - n] = s.charAt(i);
            count++;
        }
        for (int i = 0; i < n; i++) {
            newChar[count] = s.charAt(i);
            count++;
        }
        return new String(newChar);
    }

    /**
     * src      the source array.
     * srcPos   starting position in the source array.
     * dest     the destination array.
     * destPos  starting position in the destination data.
     * length   the number of array elements to be copied.
     *
     * @param s
     * @param n
     * @return
     */
    public String reverseLeftWords2(String s, int n) {
        char[] arr = s.toCharArray();
        char[] newArr = new char[s.length()];
        System.arraycopy(arr, n, newArr, 0, s.length() - n);
        System.arraycopy(arr, 0, newArr, s.length() - n, n);
        return new String(newArr);
    }

    public String reverseLeftWords3(String s, int n) {
        char[] arr = s.toCharArray();
        char[] newArr = new char[s.length()];
        int idxNew = -1;
        int idx = n;

        while (++idxNew < s.length()) {
            newArr[idxNew] = arr[idx];
            idx = idx == s.length() - 1 ? 0 : idx + 1;
        }

        return new String(newArr);
    }


}

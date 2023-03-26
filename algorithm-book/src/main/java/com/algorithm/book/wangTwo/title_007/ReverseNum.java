package com.algorithm.book.wangTwo.title_007;

public class ReverseNum {

    /***
     * todo: 九师兄  2023/3/26 14:58
     *  反转数字 就是输⼊整数，输出它的倒置。
     */
    public int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE / 10) return 0;
            if (rev < Integer.MIN_VALUE / 10) return 0;
            rev = rev * 10 + pop;
        }
        return rev;
    }
}

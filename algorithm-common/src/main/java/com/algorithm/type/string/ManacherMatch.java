package com.algorithm.type.string;

/***
 * todo: 4_5Lmd5biI5YWE5ZSv5LiA5Y6f5Yib5paH56ug77yM56aB5q2i6L2s6L29_4  2023/1/25 21:14 4 九师兄
 *   【算法】manacher 字符串最长回文数
 *   https://blog.csdn.net/qq_21383435/article/details/128759415
 */
public class ManacherMatch {

    public static char[] manacherstring(String str) {
        char[] charArr = str.toCharArray();
        char[] res = new char[str.length() * 2 + 1];
        int index = 0;
        for (int i = 0; i != res.length; i++) {
            res[i] = (i & 1) == 0 ? '#' : charArr[index++];
        }
        return res;
    }

    public static int maxLcpsLenath(String s) {

        if (s == null || s.length() == 0) {
            return 0;
        }

        // 把原始串变成处理串
        char[] str = manacherstring(s); // 1221 -> #1#2#2#1#
        int[] pArr = new int[str.length]; //回文半径数组
        int C = -1; // HE
        int R = -1; // 回文右边界的再往右一个位置 最右的有效区是R-1位置
        int max = Integer.MIN_VALUE; //扩出来的最大
        for (int i = 0; i != str.length; i++) {
            //每-个位置都求回文半径
            // i至少的回文区域，先给pArr[i]
            /***
             * todo: 31_5Lmd5biI5YWE5ZSv5LiA5Y6f5Yib5paH56ug77yM56aB5q2i6L2s6L29_31  2023/1/25 21:09 31 九师兄
             *  这一句你可能就蒙蔽了，代表 i 位置，不用验证的，i位置往左右两边扩的最小的回文区域
             *  如果 R 在 i 外，那么不用验证的区域是 1
             *  如果 R 在 i 内，那么不用验证的区域是 Math.min(pArr[2 * C - i], R - i)
             *   2 * C - i 是 i 镜像的位置
             */
            pArr[i] = R > i ? Math.min(pArr[2 * C - i], R - i) : 1;
            // 这个代码有相关的优化
            while (i + pArr[i] < str.length && i - pArr[i] > -1) {
                if (str[i + pArr[i]] == str[i - pArr[i]]) {
                    pArr[i]++;
                } else {
                    break;
                }
            }
            if (i + pArr[i] > R) {
                R = i + pArr[i];
                C = i;
            }
            max = Math.max(max, pArr[i]);
        }
        return max - 1;
    }
}

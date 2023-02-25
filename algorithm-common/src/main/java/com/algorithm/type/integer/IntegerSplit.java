package com.algorithm.type.integer;

/***
 * todo: 4_5Lmd5biI5YWE5ZSv5LiA5Y6f5Yib5paH56ug77yM56aB5q2i6L2s6L29_4  2023/2/25 17:44 4 九师兄
 *       【算法】斜率优化、正数分裂、动态规划优化
 *       https://blog.csdn.net/qq_21383435/article/details/129215621
 */
public class IntegerSplit {

    public static int spitNum(int num) {
        if (num < 1) {
            return 0;
        }
        return process(1, num);
    }


    // pre 裂开的前一个部分
    // rest 还剩多少值，需要去裂开，要求裂出来的第一部分，不要比pre小
    // 返回裂开的方法数
    public static int process(int pre, int rest) {
        if (rest == 0) {
            return 1; // 之前裂开的方案，构成了1种有效方法
        }
        // todo: 题目中要求裂开的 后面一个数 比前面的大 现在笑了说明找不到
        if (pre > rest) {
            return 0;
        }
        int ways = 0;
        for (int i = pre; i <= rest; i++) { //i:rest第一个裂开的部分，值是多少
            ways += process(i, rest - i);
        }
        return ways;
    }
}

package com.algorithm.leetcode.swordoffer.offer62;

public class RingLastOne {

    /***
     * todo: 2022/9/14 下午10:33 lcc 九师兄 重刷  比较难
     *
     * 假设是n = 5 m =3
     *   标号：a  b  c  d  e
     * 第一轮：0  1  2  3  4
     * 新索引：0  1  #  3  4   移除 c
     * 新索引：2  3     0  1   从3开始数 那么下标变成这个
     * 反推：
     *   当前位置0  数据间隔：3=m 上一轮数字个数：5
     *   （0+3）% 5 = 0  巧合是第1轮 最终结果d的新索引位置
     *
     * 第二轮：#  3  #  0  1  这次要移除 a
     * 新索引：#  0  #  1  2  索引新的变化
     * 反推：
     *   当前位置1  数据间隔：3=m 上一轮数字个数：4
     *   （1+3）% 4 = 0  巧合是第1轮 最终结果d的新索引位置
     *
     * 第3轮：#  0  #  1  #  这次要移除 e
     * 新索引 #  0  #  1  #  索引巧合没变化
     * 反推：
     *   当前位置1  数据间隔：3=m 上一轮数字个数：3
     *   （1+3）% 3 = 1  巧合是第2轮 最终结果d的新索引位置
     *
     * 第4轮：#  0  #  1  #  这次要移除 b
     * 新索引 #  #  #  0  #  索引巧合没变化
     * 反推：
     *   当前位置0  数据间隔：3=m 上一轮数字个数：2
     *   （0+3）% 2 = 1  巧合是第3轮 最终结果d的新索引位置
     *
     * 旧的编号：0 1 ...m-1  m  m+1....n-1   因为索引位置是从0开始的 所以每个数字的索引都是自己值小于1
     * 新的编号：-m -m+1 ...m-1  m  0  1 ... 因为索引位置是从0开始的 所以每个数字的索引都是自己值小于1
     *
     * 看这个看懂了一点点
     * https://www.bilibili.com/video/BV1rk4y1971Y?spm_id_from=333.337.search-card.all.click&vd_source=44c491a7c7c735ef8081cb60288bb47e
     *
     */
    public int lastRemaining(int n, int m) {
        //  todo: 下午11:05 九师兄 如果只有一个数字 那么直接返回下标0 就可以了
        if(n == 1) return 0;
        int numCount =  n - 1;
        int next = lastRemaining(numCount, m);
        int aa = next + m; // 这个相当于是
        int oldIndex = aa % n; // 这个求余数是精华 很难搞懂
        return oldIndex;
    }

}

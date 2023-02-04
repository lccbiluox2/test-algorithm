package com.algorithm.array;

import java.util.Arrays;
import java.util.HashSet;

/**
 *todo: 2023/2/4 16:42 九师兄
 * 【算法】两个集合取值平均数上升
 *  https://blog.csdn.net/qq_21383435/article/details/128882778
 **/
public class MagicTwoArrayAvgAdd {

    //请保证arr1无重复值、arr2中无重复值，且arr1和arf2肯定有数字
    public static int maxOps(int[] arr1, int[] arr2) {
        double sum1 = 0;
        for (int i = 0; i < arr1.length; i++) {
            sum1 += (double) arr1[i];
        }
        double sum2 = 0;
        for (int i = 0; i < arr2.length; i++) {
            sum2 += (double) arr2[i];
        }
        // 两个平均值一样直接结果
        if (avg(sum1, arr1.length) == avg(sum2, arr2.length)) {
            return 0;
        }

        // 平均值不相等
        int[] arrMore = null;
        int[] arrLess = null;
        double sumMore = 0;
        double sumLess = 0;
        if (avg(sum1, arr1.length) > avg(sum2, arr2.length)) {
            arrMore = arr1;
            sumMore = sum1;
            arrLess = arr2;
        }else {
            arrMore = arr2;
            sumMore = sum2;
            arrLess = arr1;
            sumMore  = sum1;
        }
        Arrays.sort(arrMore);
        HashSet<Integer> setLess = new HashSet<>() ;
        for (int num : arrLess) {
            setLess.add (num) ;
        }
        int moresize = arrMore .length;// 平均值大的集合还剩几个数
        int lessSize = arrLess. length;// 平均值小的集合还剩几个数
        int ops  =0;//操作了多少次

        for (int i =0; i  < arrMore.length; i++) { // 1 ->
            double cur = (double) arrMore[i];
            if (cur < avg(sumMore, moresize) &&
                    cur > avg(sumLess, lessSize) &&
                    !setLess.contains(arrMore[i])) {
                sumMore -= cur;
                moresize--;
                sumLess += cur;
                lessSize++;
                setLess.add(arrMore[i]);
                ops++;
            }
        }
            return ops;
    }

    private static double avg(double sum1, int length) {
        return sum1/(double) length;
    }
}

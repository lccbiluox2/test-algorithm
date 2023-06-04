package com.algorithm.leetcode.swordoffer.offer21;

import com.algorithm.swordoffer.offer21.ExchangeNum;
import org.junit.Test;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-11-28 15:29
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class ExchangeNumTest {

    private ExchangeNum exchangeNum = new ExchangeNum();

    /**
     * L         R
     * 1,3,4,5,8,7
     * temp = 7
     *
     *   L       R
     * 1,3,4,5,8,7
     * temp = 7
     *
     *     L     R
     * 1,3,4,5,8,7
     * temp = 7
     * 进行交换
     *     L     R
     * 1,3,7,5,8,4
     * 然后移动位置
     *       L R
     * 1,3,7,5,8,4
     *
     * 两遍都是偶数
     *
     * 数据
     * L         R
     * 2,3,4,5,8,7
     * temp = 7
     *
     */
    @Test
    public void exchange() {
        int[] data = new int[]{1,3,4,5,8,7};
        exchangeNum.exchange(data);
    }

    /**
     * 运行结果
     *
     * [4, 4, 12, 7, 2, 9, 12, 18, 14, 12]
     * [4, 4, 12, 7, 2, 9, 12, 18, 14, 12]
     * [4, 4, 12, 7, 2, 9, 12, 18, 14, 12]
     * [4, 4, 12, 7, 2, 9, 12, 18, 14, 12]
     * [9, 4, 12, 7, 2, 4, 12, 18, 14, 12]
     * [9, 4, 12, 7, 2, 4, 12, 18, 14, 12]
     * [9, 4, 12, 7, 2, 4, 12, 18, 14, 12]
     * [9, 4, 12, 7, 2, 4, 12, 18, 14, 12]
     * [9, 7, 12, 4, 2, 4, 12, 18, 14, 12]
     * [9, 7, 12, 4, 2, 4, 12, 18, 14, 12]
     */
    @Test
    public void exchange1() {
        int[] data = new int[]{4,4,12,7,2,9,12,18,14,12};
        exchangeNum.exchange(data);
    }

    @Test
    public void exchange2() {
        int[] data = new int[]{1,3,4,5,8,7};
        exchangeNum.reOrderArrayV1(data);
    }

}
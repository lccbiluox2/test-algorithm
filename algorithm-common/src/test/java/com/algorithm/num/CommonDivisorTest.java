package com.algorithm.num;

import org.junit.Test;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-10-11 22:27
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class CommonDivisorTest {

    @Test
    public void getGreatestCommonDivisorV2() {
        int data = CommonDivisor.getGreatestCommonDivisorV2(10, 35);
        System.out.println(data);
    }

    @Test
    public void getGreatestCommonDivisorV2Test() {
        int data = CommonDivisor.getGreatestCommonDivisorV2(2, 3);
        System.out.println(data);
    }

    @Test
    public void getGreatestCommonDivisorV3Test() {
        int data = CommonDivisor.getGreatestCommonDivisorV3(2, 3);
        System.out.println(data);
    }

    /**
     * 当a和b均为偶数时， gcd(a,b) = 2× gcd(a/2, b/2) = 2× gcd(a>>1,b>>1)。
     * 当a为偶数， b为奇数时， gcd(a,b) = gcd(a/2,b) = gcd(a>>1,b)。
     * 当a为奇数， b为偶数时， gcd(a,b) = gcd(a,b/2) = gcd(a,b>>1)。
     *
     * 当a和b均为奇数时， 先利用更相减损术运算一次， gcd(a,b) =gcd(b,a-b)，
     * 此时a-b必然是偶数， 然后又可以继续进行移位运算。
     *
     * 例如计算10和25的最大公约数的步骤如下。
     * 1. 整数10通过移位， 可以转换成求5和25的最大公约数。
     * 2. 利用更相减损术， 计算出25-5=20， 转换成求5和20的最大公约数。
     * 3. 整数20通过移位， 可以转换成求5和10的最大公约数。
     * 4. 整数10通过移位， 可以转换成求5和5的最大公约数。
     * 5. 利用更相减损术， 因为两数相等， 所以最大公约数是5。
     *
     * 这种方式在两数都比较小时， 可能看不出计算次数的优势； 当两数
     * 越大时， 计算次数的减少就会越明显。
     */
    @Test
    public void gcdTest() {
        int data = CommonDivisor.gcd(2, 3);
        System.out.println(data);
    }

    @Test
    public void gcdTest1() {
        int data = CommonDivisor.gcd(10, 25);
        System.out.println(data);
    }
}
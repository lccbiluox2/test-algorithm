package com.algorithm.num;

public class PrintMaxNum {

    /***
     * todo: 九师兄  2023/6/4 12:49
     *
     * 题目描述
     * 输入数字 n，按顺序打印出从 1 到最大的 n 位十进制数。比如输入 3，则打印出 1、2、3 一直到最大的 3 位数即 999。
     *
     */
    public int[] print1ToMaxOfNDigits(int n) {
        int sum = (int) Math.pow(10,n);
        int[] res = new int[sum-1];
        for (int i = 1; i <= sum -1; i++) {
            res[i-1] = i;
        }
        return res;
    }


    public void print1ToMaxOfNDigitsV1(int n) {
        if (n <= 0)
            return;
        char[] number = new char[n];
        print1ToMaxOfNDigits(number, 0);
    }

    private void print1ToMaxOfNDigits(char[] number, int digit) {
        if (digit == number.length) {
            printNumber(number);
            return;
        }
        for (int i = 0; i < 10; i++) {
            number[digit] = (char) (i + '0');
            print1ToMaxOfNDigits(number, digit + 1);
        }
    }

    private void printNumber(char[] number) {
        int index = 0;
        while (index < number.length && number[index] == '0')
            index++;
        while (index < number.length)
            System.out.print(number[index++]);
        System.out.println();
    }
}

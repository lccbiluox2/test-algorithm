package com.algorithm.type.string;

/**
 *todo: 2023/2/4 17:51 九师兄
 * 【算法】给定数字转成字符串
 *  https://blog.csdn.net/qq_21383435/article/details/128883890
 **/
public class NumberToString {

    public static int convertWays(int num) {
        if (num < 1) {
            return 0;
        }
        return process(String.valueOf(num).toCharArray(), 0);
    }

    // 0..index-1 己经转换完毕，并且转换正确
    // str[index •••]能转出多少种有效的字符串表达
    public static int process(char[] str, int index) {
        if (index == str.length) {
            return 1;
        }
        // index及其后续是还有数字字符的
        // 0..
        if (str[index] == '0') {//开头为0
            return 0;
        }
        // index及其后续是还有数字字符的，且不以a开头，以1~9开头
        int res = process(str, index + 1);//做了
        // 做一个决定，就让strtindex]自己作为一个部分
        if (index == str.length - 1) {//除了index之外，后续没有字符串了
            return res;
        }
        // index+1依然没越界
        // index和index+1 共同构成一个部分  <27
        if (((str[index] - '0') * 10 + str[index + 1] - '0') < 27) {
            res += process(str, index + 2);
        }
        return res;
    }

}

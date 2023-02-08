package com.algorithm.type.integer;

/**
 *todo: 2023/2/8 22:54 九师兄
 * 【算法】数字使用中文读取
 * https://blog.csdn.net/qq_21383435/article/details/128944600
 **/
public class IntegerChineseRead {

    // 只接收范围是1~9
    public static String num1To9(int num) {
        if (num < 1 || num > 9) {
            return "";
        }
        String[] names = {"一", "二", "三", "四", "五", "六", "七", "八", "九"};
        return names[num - 1];
    }

    // 只接收范围是1~99
    public static String num1To99(int num, boolean hasBai) {
        if (num < 1 || num > 99) {
            return "";
        }
        if (num < 10) {
            return num1To9(num);
        }

        int shi = num / 10;
        if (shi == 1 && (!hasBai)) {
            return "十" + num1To9(num % 10);
        } else {
            return num1To9(shi) + num1To9(num % 10);
        }
    }

    // 只接收范围是1~99
    public static String num1To999(int num, boolean hasBai) {
        if (num < 1 || num > 999) {
            return "";
        }
        if (num < 100) {
            return num1To99(num, false);
        }

        String res = num1To9(num / 100) + "百";
        int rest = num % 100;
        if (rest == 0) {
            return res;
        } else if (rest >= 10) {
            res += num1To99(rest, true);
        } else {
            res += "零" + num1To9(rest);
        }
        return res;
    }


    public static String num1To9999(int num) {
        if (num < 1 || num > 9999) {
            return "";
        }
        if (num < 1000) {
            return num1To999(num, false);
        }
        String res = num1To9(num / 1000) + "千";
        int rest = num % 1000;
        if (rest == 0) {
            return res;
        } else if (rest >= 100) {
            res += num1To999(rest, true);
        } else {
            res += "零'" + num1To99(rest, false);
        }
        return res;
    }
}

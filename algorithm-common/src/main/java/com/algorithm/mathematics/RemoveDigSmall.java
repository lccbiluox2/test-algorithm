package com.algorithm.mathematics;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-10-12 22:23
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description: 移除数字 剩下的最小
 */
public class RemoveDigSmall {

    public static String removeDigSmall(String number, int k) {
        if (k == 0) {
            return number;
        }
        int index = findBigNum(number);
        number = removeNumByIndex(number, index);
        if (number.equals("0")) {
            return "0";
        }
        if (number.startsWith("0")) {
            number = number.substring(1, number.length());
        }
        k--;
        return removeDigSmall(number, k);
    }

    private static String removeNumByIndex(String number, int index) {
        int length = number.length();
        char[] newArr = new char[length - 1];
        int j = 0;
        for (int i = 0; i < length; i++) {
            if (i == index) {
                continue;
            }
            char left = number.charAt(i);
            newArr[j] = left;
            j++;
        }
        return new String(newArr);
    }

    private static int findBigNum(String number) {
        int length = number.length();
        for (int i = 0; i < length - 1; i++) {
            char left = number.charAt(i);
            char right = number.charAt(i + 1);
            if (left > right) {
                return i;
            }
        }
        return 0;
    }


    /**
     * 删除整数的k个数字， 获得删除后的最小值
     *
     * @param num 原整数
     * @param k   删除数量
     */
    public static String removeKDigits(String num, int k) {
        String numNew = num;
        for (int i = 0; i < k; i++) {
            boolean hasCut = false;
            //从左向右遍历， 找到比自己右侧数字大的数字并删除
            for (int j = 0; j < numNew.length() - 1; j++) {
                if (numNew.charAt(j) > numNew.charAt(j + 1)) {
                    numNew = numNew.substring(0, j) +
                            numNew.substring(j + 1, numNew.length());
                    hasCut = true;
                    break;
                }
            }
            //如果没有找到要删除的数字， 则删除最后一个数字
            if (!hasCut) {
                numNew = numNew.substring(0, numNew.length() - 1);
            }
            //清除整数左侧的数字0
            numNew = removeZero(numNew);
        }
        //如果整数的所有数字都被删除了， 直接返回0
        if (numNew.length() == 0) {
            return "0";
        }
        return numNew;
    }

    private static String removeZero(String num) {
        for (int i = 0; i < num.length() - 1; i++) {
            if (num.charAt(0) != '0') {
                break;
            }
            num = num.substring(1, num.length());
        }
        return num;
    }


    /**
     * 删除整数的k个数字， 获得删除后的最小值
     *
     * @param num 原整数
     * @param k   删除数量
     */
    public static String removeKDigits1(String num, int k) {
        //新整数的最终长度 = 原整数长度-k
        int newLength = num.length() - k;
        //创建一个栈， 用于接收所有的数字
        char[] stack = new char[num.length()];
        int top = 0;
        for (int i = 0; i < num.length(); ++i) {
            //遍历当前数字
            char c = num.charAt(i);
            //当栈顶数字大于遍历到的当前数字时， 栈顶数字出栈（相当于删除数字
            while (top > 0 && stack[top - 1] > c && k > 0) {
                top -= 1;
                k -= 1;
            }
            //遍历到的当前数字入栈
            stack[top++] = c;
        }

        // 找到栈中第1个非零数字的位置， 以此构建新的整数字符串
        int offset = 0;
        while (offset < newLength && stack[offset] == '0') {
            offset++;
        }
        return offset == newLength ? "0" : new
                String(stack,
                offset, newLength - offset);
    }

}

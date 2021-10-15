package com.algorithm.mathematics;

import com.algorithm.utils.ArraysUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.tuple.Pair;

import java.util.Arrays;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-10-15 21:35
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:  两个大整数求和
 */
public class BigSum {

    /**
     * 两个大整数求和  自己实现的
     *
     * @return
     */
    public static String bigSum(String num1, String num2) {
        if (StringUtils.isBlank(num1) && StringUtils.isBlank(num2)) {
            return "0";
        }
        if (StringUtils.isBlank(num1) && !StringUtils.isBlank(num2)) {
            return num2;
        }
        if (!StringUtils.isBlank(num1) && StringUtils.isBlank(num2)) {
            return num1;
        }
        // 字符串 拆分成数组
        String[] num1Array = numToArray(num1);
        String[] num2Array = numToArray(num2);

        // 字符串数组反转
        String[] num1Reverse = arrayReverse(num1Array);
        String[] num2Reverse = arrayReverse(num2Array);

        // 数据相加
        Integer[] numAdd = arrayReverseAdd(num1Reverse, num2Reverse);

        System.out.println(Arrays.toString(numAdd));

        // 转成字符串
        String numReverse = arrayReverseInt(numAdd);
        System.out.println(numReverse);
        return numReverse;
    }

    private static String arrayReverseInt(Integer[] numAdd) {
        int length = numAdd.length;
        StringBuilder builder = new StringBuilder();
        for (int i = length - 1; 0 <= i; i--) {
            builder.append(numAdd[i]);
        }
        String data = builder.toString();
        while (data.startsWith("0")){
            data = data.substring(1,data.length());
        }
        return data;
    }

    private static Integer[] arrayReverseAdd(String[] num1Reverse, String[] num2Reverse) {
        int length1 = num1Reverse.length;
        int length2 = num2Reverse.length;
        int max = Math.max(length1, length2);

        Integer[] arr = new Integer[max + 2];

        // 进位
        int carry = 0;
        for (int i = 0; i < max + 2; i++) {
            String num1 = "0";
            String num2 = "0";
            if (i < length1) {
                num1 = num1Reverse[i];
            }
            if (i < length2) {
                num2 = num2Reverse[i];
            }
            Pair<Integer, Integer> tuple = num1AddNum2(num1, num2);
            int remainder = tuple.getLeft().intValue();
            arr[i] = remainder + carry;
            carry = tuple.getRight().intValue();
            System.out.println(arr[i] + "进位" + carry);
            System.out.println(Arrays.toString(arr));
        }
        return arr;
    }


    private static Pair<Integer, Integer> num1AddNum2(String num1, String num2) {
        if (num1 == null) {
            num1 = "0";
        }
        if (num2 == null) {
            num2 = "0";
        }
        int i = Integer.parseInt(num1);
        int j = Integer.parseInt(num2);
        int sum = i + j;
        int remainder = sum % 10;
        int shang = 0;
        if (sum > 10) {
            shang = 1;
        }
        return Pair.of(remainder, shang);
    }

    private static String[] arrayReverse(String[] num1Array) {
        int length = num1Array.length;
        String[] arr = new String[length];

        int j = 0;
        for (int i = length - 1; 0 <= i; i--) {
            arr[j] = num1Array[i];
            j++;
        }
        return arr;
    }

    private static String[] numToArray(String num1) {
        String[] arr = new String[num1.length()];
        for (int i = 0; i < num1.length(); i++) {
            char c = num1.charAt(i);
            String a = String.valueOf(c);
            arr[i] = a;
        }
        return arr;
    }


    /**
     * 大整数求和
     *
     * @param bigNumberA 大整数A
     * @param bigNumberB 大整数B
     */
    public static String bigNumberSum(String bigNumberA,
                                      String bigNumberB) {
        //1.把两个大整数用数组逆序存储， 数组长度等于较大整数位数+1
        int maxLength = bigNumberA.length() > bigNumberB.length()
                ? bigNumberA.length() : bigNumberB.length();
        int[] arrayA = new int[maxLength + 1];
        for (int i = 0; i < bigNumberA.length(); i++) {
            arrayA[i] = bigNumberA.charAt(bigNumberA.length() - 1 - i) - '0';
        }
        int[] arrayB = new int[maxLength + 1];
        for (int i = 0; i < bigNumberB.length(); i++) {
            arrayB[i] = bigNumberB.charAt(bigNumberB.length() - 1 - i) - '0';
        }
        //2.构建result数组， 数组长度等于较大整数位数+1
        int[] result = new int[maxLength + 1];
        //3.遍历数组， 按位相加
        for (int i = 0; i < result.length; i++) {
            int temp = result[i];
            temp += arrayA[i];
            temp += arrayB[i];
            //判断是否进位
            if (temp >= 10) {
                temp = temp - 10;
                result[i + 1] = 1;
            }
            result[i] = temp;
        }
        //4.把result数组再次逆序并转成String
        StringBuilder sb = new StringBuilder();
        //是否找到大整数的最高有效位
        boolean findFirst = false;
        for (int i = result.length - 1; i >= 0; i--) {
            if (!findFirst) {
                if (result[i] == 0) {
                    continue;
                }
                findFirst = true;
            }
            sb.append(result[i]);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(bigNumberSum("426709752318", "95481253129"));
    }


}

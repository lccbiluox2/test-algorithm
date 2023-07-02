package com.algorithm.num;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.LongStream;

public class NoSymbolSum {

    /***
     * todo: 九师兄  2023/7/2 14:17
     *
     * 【算法】JZ65 不用加减乘除做加法
     * https://blog.csdn.net/qq_21383435/article/details/131500573
     */
    public int Add(int num1,int num2) {
        return Math.addExact(num1,num2);
    }

    public int Add2(int num1,int num2) {
        List<Integer> list = new ArrayList<>();
        list.add(num1);
        list.add(num2);

        Integer sum =  list.stream().parallel().reduce(0, Integer::sum);
        return sum;
    }

    public int Add3(int num1,int num2) {
        // add表示进位值
        int add = num2;
        // sum表示总和
        int sum = num1;
        // 当不再有进位的时候终止循环
        while(add != 0) {
            // 将每轮的无进位和与进位值做异或求和
            int temp = sum ^ add;
            // 进位值是用与运算产生的
            add = (sum & add) << 1;
            // 更新sum为新的和
            sum = temp;
        }
        return sum;
    }
}

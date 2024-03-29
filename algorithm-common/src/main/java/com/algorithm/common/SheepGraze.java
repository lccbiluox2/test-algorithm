package com.algorithm.common;

public class SheepGraze {

    // n份青草放在一堆
    //先手后手都决定聪明
    // string "先手""后手”
    public static String winner1(int n) {
        // 0  1  2  3  4
        // 后 先  后 先 先
        if (n < 5) {
            return (n == 0 || n == 2) ? "后手" : "先手";
        }
        // n >= 5 时候
        int base = 1;// 先手决定吃的草
        while (base <= n) {
            // 当前一共n份草，先手吃掉的是base份，n - base 是留给后手的草
            // 母过程 先手 在子过程里是 后手
            if (winner1(n - base).equals("后手")) {
                return "先手";
            }
            if (base > n / 4) {
                // 防止base * 4 之后溢出
                break;
            }
            base *= 4;
        }
        return "后手";
    }
}

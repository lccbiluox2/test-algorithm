package com.algorithm.common;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-11-13 13:24
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 *
 * 【算法】汉诺塔 移动
 * todo:https://blog.csdn.net/qq_21383435/article/details/121303367
 */
public class Hanoitorower {

    public static void hanotiTower(int num,char a,char b,char c){
        if(num == 1){
            System.out.println("第一个盘从"+a+"->"+c);
        }else {
            //如果我们有n >= 2情况，我们总是可以看做是两个盘1.最下边的一个盘2..上 面的所有盘
            //1.先把最上面的所有盘A->B
            hanotiTower(num - 1, a, c, b);
            // 把下面的盘A->c
            System.out.println("第"+num+"个盘从"+a+"->"+c);
            // 把B塔的所有盘从B->C,移动过程使用a塔
            hanotiTower(num-1,b,a,c);
        }
    }
}

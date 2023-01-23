package com.algorithm.common;

import java.util.ArrayList;
import java.util.List;

/***
 * todo: 4_5Lmd5biI5YWE5ZSv5LiA5Y6f5Yib5paH56ug77yM56aB5q2i6L2s6L29_4  2023/1/23 下午2:46 4 九师兄
 *   【算法】求一个字符串的全部子序列、字符串子集
 *   https://blog.csdn.net/qq_21383435/article/details/128752617
 */
public class MaxSunString {

    public static void function(String str) {
        char[] chs = str.toCharArray();
        process(chs, 0, new ArrayList<Character>());
    }

    //当前来到i位置，要和不要，走两条路
    // res之前的选择，所形成的列表
    public static void process(char[] str, int i, List<Character> res) {
        if (i == str.length) {
            printList(res);
            return;
        }
        List<Character> resKeep = copyList(res);
        resKeep.add(str[i]);
        process(str, i + 1, resKeep);
        List<Character> resNoInclude = copyList(res);
        process(str, i + 1, resNoInclude);
    }

    private static List<Character> copyList(List<Character> res) {
        List<Character> copy = new ArrayList<>();
        for (Character item : res) {
            copy.add(item);
        }
        return copy;
    }

    private static void printList(List<Character> res) {
        for (Character item : res) {
            System.out.print(" " + item);
        }
        System.out.println();
    }



    /***
     * todo: 50_5Lmd5biI5YWE5ZSv5LiA5Y6f5Yib5paH56ug77yM56aB5q2i6L2s6L29_50  2023/1/23 下午2:59 50 九师兄
     *       使用一种更加节省空间的方法
     */
    public static void printAllSubsquence(String str) {
        char[] chs = str. toCharArray();
        process(chs, 0) ;
    }
    public static void process(char[] str, int i) {
        if (i  == str.length) {
            System.out.println(String. valueOf(str));
            return;
        }
        process(str, i + 1);
        char tmp = str[i];  // 先把原始字符串赋值给一个变量，为了保持不变
        str[i] = 0; // 这个要走另外一个路了 不要的那个路，我们就把这个设置为空
        process(str, i+1);
        str[i] = tmp; // 重新回到这个方法的时候 我们再把原始数据改回去 这样这个字符串就没有变化
    }
}

package com.algorithm.search;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-10-26 10:03
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class BinarySearch {

    public static int binarySearch(int[] arr, int left, int right, int findValue) {
        if (left > right) {
            return -1;
        }

        int mid = (left + right) / 2;
        int midVal = arr[mid];
        // 向右边递归
        if (findValue > midVal) {
            return binarySearch(arr, mid + 1, right, findValue);
        } else if (findValue < midVal) {
            return binarySearch(arr, left, mid - 1, findValue);
        } else {
            return mid;
        }
    }

    //完成一个课后思考题:

    /**
     * 课后思考题: {1,8, 10，89， 1000， 1000， 1234} 当一个有序数组中,
     * 有多个相同的数值时，如何将所有的数值都查找到，比如这里的1000
     * <p>
     * 思路分析
     * 1.在找到mid索引值，不要马上返回
     * 2.向mid索引值的左边扫描，将所有满足1000，的元素的下标，加入到集合ArrayList
     * 3.向mid索引值的右边扫描，将所有满足1000，的元素的下标，加入到集合ArrayList
     * 4.将Arraylist返回
     */
    public static List<Integer> binarySearch1(int[] arr, int left, int right, int findValue) {
        System.out.println("查找次数");
        if (left > right) {
            return new ArrayList<>();
        }

        int mid = (left + right) / 2;
        int midVal = arr[mid];
        // 向右边递归
        if (findValue > midVal) {
            return binarySearch1(arr, mid + 1, right, findValue);
        } else if (findValue < midVal) {
            return binarySearch1(arr, left, mid - 1, findValue);
        } else {

            List<Integer> resIndexlist = new ArrayList<Integer>();
            //向mid索引值的左边扫描，将所有满足1000，的元素的下标，加入到集合ArrayList
            int temp = mid - 1;
            while (true) {
                if (temp < 0 || arr[temp] != findValue) {//iW
                    break;
                }
                //
                resIndexlist.add(temp);
                temp -= 1; //temp左移
            }
            resIndexlist.add(mid);

            //向mid索引值的右边扫描，将所有满足1000，的元素的下标， 加入到集合ArrayList
            temp = mid + 1;
            while (true) {
                if (temp > arr.length - 1 || arr[temp] != findValue) {//iW
                    break;
                }
                //
                resIndexlist.add(temp);
                temp += 1; //temp左移
            }

            return resIndexlist;
        }
    }
}

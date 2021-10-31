package com.algorithm.sort;

import java.util.Arrays;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-10-31 11:04
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 *
 * todo: 堆排序
 *      https://blog.csdn.net/qq_21383435/article/details/121060629
 */
public class HeapSort {


    // 編写一个堆排序的方法
    public static void heapSort(int arr[]) {
        System.out.println("堆排序!!");
        for (int i = arr.length / 2 - 1; 0 <= i; i--) {
            adjustHeap(arr, i, arr.length);
        }

        int temp;
        for (int j = arr.length - 1; 0 < j; j--) {
            temp = arr[j];
            arr[j] = arr[0];
            arr[0] = temp;
            adjustHeap(arr, 0, j);
        }
        System.out.println(Arrays.toString(arr));
    }

    //将-个数组(二叉树),调整成一个大顶堆

    /**
     * 举例intarr[]={4,6,8,5,9};=>i=1=>adjustHeap=>得到{4,9,8,5,6}
     * 如果我们再次调用adjustHeap 传入的是i = 0 =>得到{4, 9, 8, 5, 6} => {9,6,8,5, 4}
     *
     * @param arr 待调整的数组
     * @param i   表示非叶子结点在数组中索引
     * @paramlenght表示对多少个元素继续调整，
     */
    public static void adjustHeap(int arr[], int i, int lenght) {
        int temp = arr[i];//先取出当 前元素的值，保存在临时变量
        //开始调整
        //说明
        //1.k=i*2+1k是i结点的左子结点
        for (int k = i * 2 + 1; k < lenght; k = k * 2 + 1) {
            if (arr[k] < arr[k + 1]) { //说明左子结点的值小于右子结点的值
                k++;
            }
            if (arr[k] > temp) { //如果子结点大于父结点
                arr[i] = arr[k]; //把较大的值赋给当前结点
                i = k;//p!!i指向k,继续循环比较
            } else {
                break;
            }
            //当for循环结束后，我们已经将以i为父结点的树的最大值，放在了最顶(局部)
            arr[i] = temp;//将temp值放到调整后的位置
        }
    }
}

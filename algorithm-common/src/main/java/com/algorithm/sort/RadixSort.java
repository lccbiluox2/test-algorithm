package com.algorithm.sort;

import java.util.Arrays;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-10-24 18:47
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description: 桶排序
 */
public class RadixSort {

    public static void radixSort(int[] arr) {

        //定义一个二维数组，表示10个桶，每个桶就是一一个一维数组
        //说明
        //1.二维数组包含10个一维数组
        //2.为了防止在放入数的时候，数据溢出，则每个-维数组(桶),大小定为arr . length
        //3.名明确，基数排序是使用空间换时间的经典算法
        int[][] bucket = new int[10][arr.length];

        //为了记录每个桶中,实际存放了多少个数据,我们定义一个一维数组来记录各个桶的每次放入的数据个数
        //可以这里理解
        //比如: bucketElementCounts[0]， 记录的就是bucket[0]桶的放入数据个数
        int[] bucketElementCounts = new int[10];

        //第1轮(针对每个元素的个位进行排序处理)
        for (int j = 0; j < arr.length; j++) {
            //取出每个元素的个数
            int digit0fElement = arr[j] % 10;
            //放入到对应的桶中
            bucket[digit0fElement][bucketElementCounts[digit0fElement]] = arr[j];
            // 记录了每个桶中有多少个数据
            bucketElementCounts[digit0fElement]++;
        }

        //按照这个桶的顺序(一维数组的下标依次取出数据，放入原来数组)
        int index = 0;
        //遍历每一桶，并将桶中是数据,放入到原数组
        for (int k = 0; k < bucketElementCounts.length; k++) {
            //如果桶中，有数据，我们才放入到原数组
            if (bucketElementCounts[k] != 0) {
                //循环该桶即第k个桶(即第k个- -维数组),放入
                for (int i = 0; i < bucketElementCounts[k]; i++) {
                    //取出元素放入到arr.
                    arr[index] = bucket[k][i];
                    index++;
                }
            }
        }
        System.out.println("第一轮：" + Arrays.toString(arr));

        // 清 空桶的计数
        for (int i = 0; i < bucketElementCounts.length; i++) {
            bucketElementCounts[i] = 0;
        }

        // 第二轮处理
        //第1轮(针对每个元素的个位进行排序处理)
        for (int j = 0; j < arr.length; j++) {
            //取出每个元素的个数
            int digit0fElement = arr[j] / 10 % 10;
            //放入到对应的桶中
            bucket[digit0fElement][bucketElementCounts[digit0fElement]] = arr[j];
            // 记录了每个桶中有多少个数据
            bucketElementCounts[digit0fElement]++;
        }
        index = 0;
        //按照这个桶的顺序(一维数组的下标依次取出数据，放入原来数组)
        //遍历每一桶，并将桶中是数据,放入到原数组
        for (int k = 0; k < bucketElementCounts.length; k++) {
            //如果桶中，有数据，我们才放入到原数组
            if (bucketElementCounts[k] != 0) {
                //循环该桶即第k个桶(即第k个- -维数组),放入
                for (int i = 0; i < bucketElementCounts[k]; i++) {
                    //取出元素放入到arr.
                    arr[index++] = bucket[k][i];
                }
            }
        }
        System.out.println("第2轮：" + Arrays.toString(arr));


        // 清 空桶的计数
        for (int i = 0; i < bucketElementCounts.length; i++) {
            bucketElementCounts[i] = 0;
        }

        // 第二轮处理
        //第1轮(针对每个元素的个位进行排序处理)
        for (int j = 0; j < arr.length; j++) {
            //取出每个元素的个数
            int digit0fElement = arr[j] / 100 % 10;
            //放入到对应的桶中
            bucket[digit0fElement][bucketElementCounts[digit0fElement]] = arr[j];
            // 记录了每个桶中有多少个数据
            bucketElementCounts[digit0fElement]++;
        }
        index = 0;
        //按照这个桶的顺序(一维数组的下标依次取出数据，放入原来数组)
        //遍历每一桶，并将桶中是数据,放入到原数组
        for (int k = 0; k < bucketElementCounts.length; k++) {
            //如果桶中，有数据，我们才放入到原数组
            if (bucketElementCounts[k] != 0) {
                //循环该桶即第k个桶(即第k个- -维数组),放入
                for (int i = 0; i < bucketElementCounts[k]; i++) {
                    //取出元素放入到arr.
                    arr[index++] = bucket[k][i];
                }
            }
        }
        System.out.println("第3轮：" + Arrays.toString(arr));
    }

    /**
     * 测试点：测试上面的推导过程
     * @param arr
     */
    public static void radixSortEvolution(int[] arr) {
        // 求出数组最大值
        int max = getMax(arr);
        // 求出最大值的位数
        int maxLength = (max + "").length();

        int[][] bucket = new int[10][arr.length];

        //为了记录每个桶中,实际存放了多少个数据,我们定义一个一维数组来记录各个桶的每次放入的数据个数
        //可以这里理解
        //比如: bucketElementCounts[0]， 记录的就是bucket[0]桶的放入数据个数
        int[] bucketElementCounts = new int[10];

        int n = 1;
        int index = 0;
        for (int km = 0; km < maxLength; km++) {
            // (针对每个元素的个位进行排序处理)
            for (int j = 0; j < arr.length; j++) {
                //取出每个元素的个数
                int digit0fElement = arr[j] / n % 10;
                //放入到对应的桶中
                bucket[digit0fElement][bucketElementCounts[digit0fElement]] = arr[j];
                // 记录了每个桶中有多少个数据
                bucketElementCounts[digit0fElement]++;
            }
            n = n * 10;

            //按照这个桶的顺序(一维数组的下标依次取出数据，放入原来数组)
            index = 0;
            //遍历每一桶，并将桶中是数据,放入到原数组
            for (int k = 0; k < bucketElementCounts.length; k++) {
                //如果桶中，有数据，我们才放入到原数组
                if (bucketElementCounts[k] != 0) {
                    //循环该桶即第k个桶(即第k个- -维数组),放入
                    for (int i = 0; i < bucketElementCounts[k]; i++) {
                        //取出元素放入到arr.
                        arr[index] = bucket[k][i];
                        index++;
                    }
                }
            }
            System.out.println("第" + km + "轮：" + Arrays.toString(arr));

            // 清 空桶的计数
            for (int k = 0; k < bucketElementCounts.length; k++) {
                bucketElementCounts[k] = 0;
            }
        }
    }

    private static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
}

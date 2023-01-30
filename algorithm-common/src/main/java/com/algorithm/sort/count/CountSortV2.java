package com.algorithm.sort.count;

/***
 * todo: 4_5Lmd5biI5YWE5ZSv5LiA5Y6f5Yib5paH56ug77yM56aB5q2i6L2s6L29_4  2023/1/30 14:28 4 九师兄
 *  计数排序
 *  https://segmentfault.com/a/1190000039898739
 */
public class CountSortV2 {

    public static int[] countSort(int[] A) {
        // 找出数组A中的最大值
        int max = Integer.MIN_VALUE;
        for (int num : A) {
            max = Math.max(max, num);
        }
        // 初始化计数数组count
        int[] count = new int[max+1];
        // 对计数数组各元素赋值
        for (int num : A) {
            count[num]++;
        }
        // 创建结果数组
        int[] result = new int[A.length];
        // 创建结果数组的起始索引
        int index = 0;
        // 遍历计数数组，将计数数组的索引填充到结果数组中
        for (int i=0; i<count.length; i++) {
            while (count[i]>0) {
                result[index++] = i;
                count[i]--;
            }
        }
        // 返回结果数组
        return result;
    }


    public static  int[] countSort2(int[] A) {
        // 找出数组A中的最大值、最小值
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : A) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        // 初始化计数数组count
        // 长度为最大值减最小值加1
        int[] count = new int[max-min+1];
        // 对计数数组各元素赋值
        for (int num : A) {
            // A中的元素要减去最小值，再作为新索引
            count[num-min]++;
        }
        // 创建结果数组
        int[] result = new int[A.length];
        // 创建结果数组的起始索引
        int index = 0;
        // 遍历计数数组，将计数数组的索引填充到结果数组中
        for (int i=0; i<count.length; i++) {
            while (count[i]>0) {
                // 再将减去的最小值补上
                result[index++] = i+min;
                count[i]--;
            }
        }
        // 返回结果数组
        return result;
    }


    public static int[] countSort4(int[] A) {
        // 找出数组A中的最大值、最小值
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : A) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        // 初始化计数数组count
        // 长度为最大值减最小值加1
        int[] count = new int[max-min+1];
        // 对计数数组各元素赋值
        for (int num : A) {
            // A中的元素要减去最小值，再作为新索引
            count[num-min]++;
        }
        // 计数数组变形，新元素的值是前面元素累加之和的值
        for (int i=1; i<count.length; i++) {
            count[i] += count[i-1];
        }
        // 创建结果数组
        int[] result = new int[A.length];
        // 遍历A中的元素，填充到结果数组中去，从后往前遍历
        for (int j=A.length-1; j>=0; j--) {
            result[count[A[j]-min]-1] = A[j];
            count[A[j]-min]--;
        }
        return result;
    }
}

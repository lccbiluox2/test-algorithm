package com.algorithm.heap;

import com.algorithm.utils.ArraysUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

/***
 * todo: 2023/1/7 下午10:03 lcc 九师兄
 *    堆排序 https://blog.csdn.net/qq_21383435/article/details/121060629
 */
public class BigHeapDemo {

    private static Logger logger = LoggerFactory.getLogger(BigHeapDemo.class);


    //某个数现在处在index位置，往上继续移动
    public static void heapInsert(int[] arr, int index) {
        //如果当前的数大于父位置的数
        while (arr[index] > arr[(index - 1) / 2]) {
            //当前的数和父位交换
            swap(arr, index, (index - 1) / 2);
            //来到父位置，继续while判断
            index = (index - 1) / 2;
            printDetail(index, arr);
        }
    }

    //某个数现在处在index位置，往上继续移动
    public static void heapInsertDebug(int[] arr, int index) {
        logger.info("准备插入数据:index: {} 数据:{}", index, arr[index]);
        //如果当前的数大于父位置的数
        while (arr[index] > arr[(index - 1) / 2]) {
            //当前的数和父位交换
            swap(arr, index, (index - 1) / 2);
            //来到父位置，继续while判断
            index = (index - 1) / 2;
            printDetail(index, arr);
        }
    }

    private static void printDetail(int index, int[] arr) {
        System.out.println("当前索引" + index + " 索引位置上的数据：" + arr[index]);
        System.out.println("父亲索引" + (index - 1) / 2 + " 父亲索引位置上的数据：" + arr[(index - 1) / 2]);
        System.out.println(Arrays.toString(arr));
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    //某个数在index位置，能否往下移动
    public static void heapify(int[] arr, int index, int heapSize) {
        int left = index * 2 + 1;   //左孩子下标
        //判断下面还有没有孩子,巧妙的地方 左孩子下标都没有越界 那么右边孩子 肯定不越界
        while (left < heapSize) {
            //两个孩子中，谁的值大，把下标给largest
            int largest = left + 1 < heapSize && arr[left + 1] > arr[left]
                    ? left + 1 : left;

            //父和较大孩子之间，谁的值大，下标给largest
            largest = arr[largest] > arr[index] ? largest : index;

            // 如果最大值是父节点的值 那么结束
            if (largest == index) {
                break;
            }
            // 把最大值和父节点交换
            swap(arr, largest, index);
            index = largest;   //新当前位置
            left = index * 2 + 1;  //新左孩子下标
        }
    }


    //堆排序
    public static int[] headSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return arr;
        }
        for (int i = 0; i < arr.length; i++) {   //O(N)
            heapInsert(arr, i);  //调用heapInsert方法，使数组变成大根堆 O(logN)
        }

        /*for (int i = arr.length-1;i>=0;i--){
            heapify(arr,i,arr.length);
        }*/

        int heapSize = arr.length;
        swap(arr, 0, --heapSize);
        while (heapSize > 0) {     //O(N)
            heapify(arr, 0, heapSize); //O(logN)
            swap(arr, 0, --heapSize);  //O(1)
        }
        return arr;
    }

}

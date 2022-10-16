package com.algorithm.heap;

public class BigHeapDemo {

    //某个数现在处在index位置，往上继续移动
    public static void heapInsert(int[] arr,int index){
        //如果当前的数大于父位置的数
        while (arr[index] > arr[(index - 1) /2]){
            //当前的数和父位交换
            swap(arr,index,(index-1)/2);
            //来到父位置，继续while判断
            index = (index-1)/2;
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp=arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    //某个数在index位置，能否往下移动
    public static void heapify(int[] arr,int index,int heapSize){
        int left = index *2+1;   //左孩子下标
        //判断下面还有没有孩子
        while (left < heapSize){
            //两个孩子中，谁的值大，把下标给largest
            int largest = left +1 <heapSize && arr[left +1] > arr[left]
                    ? left +1 : left;

            //父和较大孩子之间，谁的值大，下标给largest
            largest = arr[largest] > arr[index] ? largest : index;

            if (largest == index){
                break;
            }
            swap(arr,largest,index);
            index = largest;   //新当前位置
            left = index*2+1;  //新左孩子下标
        }
    }

    
    //堆排序
    public static int[] headSort(int[] arr){
        if (arr == null || arr.length <2){
            return arr;
        }
        for (int i = 0;i<arr.length;i++){   //O(N)
            heapInsert(arr,i);  //调用heapInsert方法，使数组变成大根堆 O(logN)
        }

        /*for (int i = arr.length-1;i>=0;i--){
            heapify(arr,i,arr.length);
        }*/

        int heapSize = arr.length;
        swap(arr,0,--heapSize);
        while (heapSize >0){     //O(N)
            heapify(arr,0,heapSize); //O(logN)
            swap(arr,0,--heapSize);  //O(1)
        }
        return arr;
    }

}

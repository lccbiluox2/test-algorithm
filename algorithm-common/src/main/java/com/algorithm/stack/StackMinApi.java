package com.algorithm.stack;

/**
 * todo: 2023/6/29 22:59 九师兄
 *
 * 【算法】JZ30 包含min函数的栈
 * https://blog.csdn.net/qq_21383435/article/details/131466048
 **/
public class StackMinApi {

    int[] arr = new int[300];
    int current = -1;
    int minIndex = 0;

    public void push(int node) {
        arr[current+1] = node;
        current++;
        if (node < arr[minIndex]) {
            minIndex = current;
        }
    }

    public void pop() {
        int cur = arr[current];
        // 如果去掉的值不是最小值 那么最小值不变
        if (current != minIndex) {
            current--;
            return;
        }
        // 如果去掉的是最小值 那么我们要找到最小值
        Integer max = Integer.MAX_VALUE;
        for (int i = 0; i < current; i++) {
            if (arr[i] < max) {
                max = arr[i];
                minIndex = i;
            }
        }
        current--;
        if(current == 0){
            minIndex = 0;
        }
    }

    public int top() {
        return arr[current];
    }

    public int min() {
        return arr[minIndex];
    }

}

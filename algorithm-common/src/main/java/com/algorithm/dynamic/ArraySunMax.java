package com.algorithm.dynamic;

import java.util.Arrays;

public class ArraySunMax {

    public static  int[] delete(int[] arr,int L,int R){
        int n = arr.length;
        int[] ans = new int[n - (R -L +1)];
        int index = 0;
        for (int i = 0; i < L; i++) {
            ans[index++] = arr[i];
        }
        for (int i = R+1; i < n; i++) {
            ans[index++] = arr[i];
        }
        return ans;
    }

    public static int maxLen2(int[] arr){
        if(arr.length == 0){
            return 0;
        }
        int n = arr.length;
        int[] sorted = new int[n];
        for (int i = 0; i < n; i++) {
            sorted[i] = arr[i];
        }
        Arrays.sort(sorted);
//        Segmen
        return 0;
    }
}



















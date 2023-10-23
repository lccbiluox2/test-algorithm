//package com.algorithm.array;
//
//public class ArrayDownUp {
//
//    public static int ways2(int[] arr){
//        if(arr == null || arr.length < 2){
//            return 0; // 数据太少不足以升降
//        }
//        int n = arr.length;
//        boolean[] rightUp = new boolean[n];
//        boolean[] rightDown = new boolean[n];
//
//        rightUp[n- 1] = true;
//        rightDown[n- 1] = true;
//        for (int i = n-2; 0 <= i ; i--) {
//            rightUp[i] = arr[i] < arr[i+1] && rightDown[i+1];
//            rightDown[i] = arr[i] > arr[i+1] && rightUp[i+1];
//        }
//        if(rightUp[0] || rightDown[0]){
//            return 0;
//        }
//        int ans = (rightUp[1] || rightDown[1]) ? 1: 0;
//        boolean leftUp = true;
//        boolean leftDown = true;
//        boolean tmp;
//        for (int i = 1,l = 0,r=2; i < n-1 ; i++,l++,r++) {
//            ans+=(arr[l]> arr[r] && rightUp[r] && leftDown) || (arr[l] < ans[r])
//                    tmp = leftUp;
//        }
//    }
//}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//

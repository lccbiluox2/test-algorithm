package com.algorithm.array;


public class RotationArray {

    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    private void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public void rotateV2(int[] nums, int k) {
        k = k % nums.length;
        reversev2(nums, 0, nums.length);
        reversev2(nums, 0, k);
        reversev2(nums, k, nums.length);
    }

    private void reversev2(int[] array, int startIndexInclusive, int endIndexExclusive) {
        if (array == null) {
            return;
        }
        int i = Math.max(startIndexInclusive, 0);
        int j = Math.min(array.length, endIndexExclusive) - 1;
        int tmp;
        while (j > i) {
            tmp = array[j];
            array[j] = array[i];
            array[i] = tmp;
            j--;
            i++;
        }
    }

    public void rotateV3(int[] nums, int k) {
        k = k % nums.length;
        org.apache.commons.lang3.ArrayUtils.reverse(nums, 0, nums.length);
        org.apache.commons.lang3.ArrayUtils.reverse(nums, 0, k);
        org.apache.commons.lang3.ArrayUtils.reverse(nums, k, nums.length);
    }
}

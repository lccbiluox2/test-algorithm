package com.algorithm.array;

/***
 * todo: 九师兄  2023/7/2 22:36
 *
 * 【算法】在排序数组中查找元素的第一个和最后一个位置
 * https://blog.csdn.net/qq_21383435/article/details/131506114
 */
public class ArrayTargetIndex {

    public int[] searchRange(int[] nums, int target) {
        if(nums == null || nums.length < 1){
            return new int[]{-1,-1};
        }
        int left = 0, right = nums.length-1;
        while (left < right) { // 循环直至区间左右端点相同
            int mid = left + (right - left) / 2; // 防止计算时溢出
            // 如果数字打印中间值 那么数据在右边
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                // 否则数据在左边
                right = mid;
            }
        }
        if(nums[left] != target){
            return new int[]{-1,-1};
        }
        // 此时找到这个值 但是这个值可能是 1，2,3,3,3,4,5 指向里面的第一个3，也可能是第二个
        // 也可能是第三个
        int leftIndex = left;
        for (int i = left; 0 < i; i--) {
            if (nums[i] < target) {
                leftIndex = i + 1;
                break;
            }
        }
        int rightIndex = left;
        for (int i = left; i < nums.length; i++) {
            if (nums[i] > target) {
                rightIndex = i -1;
                break;
            }
            if (nums[i] == target && i < nums.length -1 ) {
                rightIndex++;
            }
        }
        int[] arr = new int[]{leftIndex,rightIndex};
        return arr;
    }

    public int[] searchRangev1(int[] nums, int target) {
        int length = nums.length;
        if(length == 0){
            return new int[]{-1,-1};
        }
        int firstIndex = findFirstIndex(nums,target);
        // 第一个元素都找不到 那么直接返回
        if(firstIndex == -1){
            return new int[]{-1,-1};
        }
        int lastIndex = findLastIndex(nums,target);
        return new int[]{firstIndex,lastIndex};
    }

    private int findLastIndex(int[] nums, int target) {
        int left = 0, right = nums.length-1;
        while (left < right) { // 循环直至区间左右端点相同
            int mid = (right + left + 1) >>> 1; // 防止计算时溢出
            // 如果数字打印中间值 那么数据在右边
            if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] == target){
                // 如果相等，那么需要继续往右边搜索
                left = mid;
            } else {
                // 当中间这个元素严格大于目标元素的时候，那么数据一定在左边
                right = mid - 1;
            }
        }
        // 如果最终找到 那么返回
        if(nums[left] == target){
            return left;
        }
        return -1;
    }

    private int findFirstIndex(int[] nums, int target) {
        int left = 0, right = nums.length-1;
        while (left < right) { // 循环直至区间左右端点相同
            int mid = (right + left) >>> 1; // 防止计算时溢出
            // 如果数字打印中间值 那么数据在右边
            if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] == target){
                // 如果相等，那么需要继续往左边搜索
                right = mid;
            } else {
                // 否则数据在左边
                right = mid - 1;
            }
        }
        // 如果最终找到 那么返回
        if(nums[left] == target){
            return left;
        }
        return -1;
    }
}

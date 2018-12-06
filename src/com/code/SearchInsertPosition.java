package com.code;


/**
 * Search Insert Position
 * https://leetcode.com/problems/search-insert-position/
 */
public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]  == target) return i;
            if (nums[i] > target ) return i;
        }
        return nums.length;
    }

}


/* 优化算法 可以采用二分

 public int searchInsert(int[] nums, int target) {
        int length = nums.length;
        int low = 0,height = nums.length;
        while (low <= height) {
            int mid = (height + low) / 2;
            if (nums[mid] == target) return mid;
            if (nums[mid] > target) height = mid - 1;
            else low = mid + 1;
        }
        return low;
    }

 */

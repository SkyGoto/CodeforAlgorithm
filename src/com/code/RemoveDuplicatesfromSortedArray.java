package com.code;


/**
 * Topic position:   Remove Duplicates from Sorted Array
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 */

class RemoveDuplicatesfromSortedArray {
    public int removeDuplicates(int[] nums) {
        int length = nums.length,l = 0;
        for (int i=1; i < nums.length; i++ ) {
            if (nums[l] == nums[i]) {
                length--;
            } else {
                nums[++l] = nums[i];
            }
        }
        return length;
    }
}

/* 代码可优化如下:

public int removeDuplicates(int[] nums) {
    int l = 0;
    for (int i=1; i < nums.length; i++ ) {
        if (nums[l] != nums[i]) {
            nums[++l] = nums[i];
        }
    }
    return l+1;
}

 */

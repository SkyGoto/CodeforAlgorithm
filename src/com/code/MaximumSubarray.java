package com.code;

/**
 * Maximum Subarray
 * https://leetcode.com/problems/maximum-subarray/
 * dp 解法 若dp[i] 小于 0 就重0 开始
 */
public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int []dp = new int[nums.length+1];
        int max = dp[0] = nums[0];
        for (int i=1; i < nums.length; i++) {
            dp[i] = nums[i] + (dp[i-1] >= 0 ? dp[i-1]:0);
            max = Math.max(max, dp[i]);
        }
        return max;
    }
}

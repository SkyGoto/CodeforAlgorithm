package com.code;


import java.util.Arrays;

/**
 *   Topic position:     longest common prefix
 *   https://leetcode.com/problems/longest-common-prefix/
 */
public class LongestCommonPrefix {
    public static void main(String [] args) {
        Solution solution = new Solution();
        String  s = solution.longestCommonPrefix(new String[]{"flower","flow","flight"});
        System.out.println(s);
    }
}

class Solution {
     String longestCommonPrefix(String[] strs) {
        StringBuilder builder = new StringBuilder();
        if (strs != null && strs.length > 0){
            Arrays.sort(strs);
            char[] a = strs[0].toCharArray();
            char[] b = strs[strs.length-1].toCharArray();
             for (int i = 0 ; i < a.length ; i ++) {
                 if (b.length > i && b[i] == a[i]) {
                     builder.append(a[i]);
                 }else {
                     break;
                 }
             }
        }
        return builder.toString();
    }
}

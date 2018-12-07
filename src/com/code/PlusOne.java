package com.code;

/**
 * Plus One
 * https://leetcode.com/problems/plus-one/
 *
 */

public class PlusOne {
    public int[] plusOne(int[] digits) {
        int a = 0;
        int [] num ;
        digits[digits.length-1] ++;
        for (int i=digits.length-1 ; i >= 0 ;i--) {
            int t = (digits[i] +a)% 10;
            a = (digits[i] +a)/ 10;
            digits[i] = t ;
        }
        if (a == 0) return digits;
        else {
            num = new int[digits.length+2];
            num[0] = a;
            System.arraycopy(digits, 0, num, 1, digits.length + 1 - 1);
            return num;
        }

    }
}



/*比较神奇的解法

class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
	for (int i = n-1; i >= 0; i--){
		if(digits[i]<9){
			digits[i]++;
		return digits;   //不是 9 就不会进位直接返回
		}
		digits[i]=0;
    }
    int newNumber[] = new int[n+1];
    newNumber[0] = 1;
    return newNumber;


    }
}
 */

package com.code;

/**
 * Sqrt(x)
 * https://leetcode.com/problems/sqrtx/
 */
public class Sqrt_x {
    public int mySqrt(int x) {
        return (int)Math.sqrt(x);
    }
}

/*  Look for the critical point: i * i <= x && (i+1)(i+1) > x

public int mySqrt(int x) {
	if (x == 0) return 0;
	int start = 1, end = x;
	while (start < end) {
		int mid = start + (end - start) / 2;
		if (mid <= x / mid && (mid + 1) > x / (mid + 1))// Found the result
			return mid;
		else if (mid > x / mid)// Keep checking the left part
			end = mid;
		else
			start = mid + 1;// Keep checking the right part
	}
	return start;
}

牛顿解法 Newton Solution :  f(x) = x^2  ==> x^2 - a = 0
public int mySqrt(int x) {
    if (x == 0) return 0;
	long i = x;
	while(i > x / i)
		i = (i + x / i) / 2;
	return (int)i;
}
 */

package com.code;

import org.junit.Test;

import java.util.Arrays;

public class DemoTest {
    @Test
    public void demoTest() {
        PlusOne demo = new PlusOne();
        System.out.println(Arrays.toString(demo.plusOne(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0})));
    }




    @Test
    public void demo() {
        String ps = "ABCDAB";
        char[] p = ps.toCharArray();
        int[] next = new int[p.length];
        next[0] = -1;
        int j = 0;
        int k = -1;
        while (j < p.length - 1) {
            if (k == -1 || p[j] == p[k]) {
                next[++j] = ++k;
            } else {
                k = next[k];
            }
        }
    }
}

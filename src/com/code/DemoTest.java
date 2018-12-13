package com.code;

import org.junit.Test;

import java.util.Arrays;

public class DemoTest {
    @Test
    public void demoTest() {
        AddBinary demo = new AddBinary();
        System.out.println(demo.addBinary("1010","1011"));
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

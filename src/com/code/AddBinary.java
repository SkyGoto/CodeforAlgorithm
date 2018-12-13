package com.code;

/**
 * Add Binary
 * https://leetcode.com/problems/add-binary/
 */
public class AddBinary {
    public String addBinary(String a, String b) {
        int lena = a.length();
        int lenb = b.length();
        int carry = 0;
        StringBuilder stringBuilder = new StringBuilder();
        while (Math.max(lena,lenb) > 0) {
            int aNum = lena > 0?(a.charAt(--lena)-'0'):0;
            int bNum = lenb > 0?(b.charAt(--lenb)-'0'):0;
            int cNum = aNum + bNum + carry;
            stringBuilder.append(cNum&1);
            carry = cNum / 2;
        }
        return carry == 1?stringBuilder.append(1).reverse().toString():stringBuilder.reverse().toString();
    }
}

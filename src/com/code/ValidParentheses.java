package com.code;


import java.util.Stack;


/**
 * Topic position:   Valid Parentheses
 * https://leetcode.com/problems/valid-parentheses/
 */
class ValidParentheses {
    boolean isValid(String s) {
        char[] a = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (int i = 0 ; i < s.length() ; i++) {
            if (a[i] == '(' ||a[i] == '[' || a[i] == '{' ) {
                stack.push(a[i]);
            } else if (!stack.isEmpty() && a[i] == ')'){
                char b = stack.pop();
                if (b+1 != a[i]) {
                    return false;
                }
            }else if (!stack.isEmpty() &&( a[i] == ']' || a[i] == '}' )){
                char b = stack.pop();
                if (b+2 != a[i]) {
                    return false;
                }
            }
            else {
                return false;
            }
        }
        return stack.isEmpty();
    }
}


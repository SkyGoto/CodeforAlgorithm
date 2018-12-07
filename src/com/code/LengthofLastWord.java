package com.code;

public class LengthofLastWord {
    public int lengthOfLastWord(String s) {
        String [] strings = s.split(" ");
        if (strings.length <= 0 ) return 0;
        return strings[Math.max(0,strings.length-1)].length();
    }
}


/*
  注意事项 :
    split 可能返回空数组 即 strings.length  == 0
    数组为空 :
        strings.length == 0 || strings == null
 */

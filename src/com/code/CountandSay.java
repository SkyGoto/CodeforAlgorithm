package com.code;

public class CountandSay {
    public String countAndSay(int n) {
        if (n==1) {
            return "1";
        }
        String a = "";
        a = countAndSay(n-1);
        char [] b= a.toCharArray();
        a = "";
        int count = 1;
        for(int i = 0; i < b.length;i++){
            if(i<b.length-1 && b[i] == b[i+1]){
                count++;
            }else{
                a = a + count + b[i];
                count = 1;
            }
        }
        return a;
    }
}

package com.boomer;

/**
 * Created by Omer on 4/1/2016.
 */

/*
    Find the question at: https://www.glassdoor.com/Interview/1-check-whether-a-string-is-palindrome-2-reverse-words-in-a-string-QTN_1310618.htm
 */
public class ReverseWordsInString {
    public static String reverse(String s){
        String reversed="";

        char[] c = s.toCharArray();

        int wordBeg=0;
        int wordEnd=0;

        for(int i = 0;i <c.length;i++){
            if(i>wordBeg && (c[i]==' '||i==c.length-1)){
                wordEnd=i;
                for(int j=wordEnd;j>=wordBeg;j--){
                    reversed+=c[j];
                }
                wordBeg=i;
                wordEnd=i;
                continue;
            }
            if(c[i]!=' '){
                wordEnd=i;
            }else{
                wordBeg=i;
                wordEnd=i;
                reversed+=' ';
            }
        }

        return reversed;
    }
}

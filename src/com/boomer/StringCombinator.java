package com.boomer;

/**
 * Created by Omer on 4/3/2016.
 */

/*
    Find the question at: http://www.mytechinterviews.com/combinations-of-a-string
 */
public class StringCombinator {
    public static void combine(String s){
        StringBuffer out = new StringBuffer();
        combinator(s,out,0);
    }

    private static void combinator(String s,StringBuffer out, int index){

        for(int i = index; i<s.length();i++){
            char c = s.charAt(i);
            out.append(c);
            System.out.println(out.toString());
            combinator(s,out,index+1);
            out.deleteCharAt(index);
        }
    }
}

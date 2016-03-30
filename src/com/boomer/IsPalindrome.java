package com.boomer;

/**
 * Created by Omer on 3/30/2016.
 */
public class IsPalindrome {
    public static boolean check(String s){
        char[] chars = s.toCharArray();
        int itr = chars.length/2;
        for(int i = 0;i<itr;i++){
            if(chars[i]!=chars[chars.length-1-i]){return false;}
        }
        return true;
    }
}

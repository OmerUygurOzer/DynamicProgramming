package com.boomer;

import java.util.HashMap;

/**
 * Created by Omer on 4/1/2016.
 */
/*
  Find the question at: https://www.glassdoor.com/Interview/Given-an-unsorted-string-determine-if-it-can-be-presented-as-a-palindrome-MMO-True-DOOR-False-QTN_1413904.htm
 */
public class CanBePalindrome {
    public static boolean check(String s){
        char c[] = s.toCharArray();

        HashMap<Character,Integer> charCounts = new HashMap<>();

        for(char i:c){
            if(charCounts.get(i)==null){charCounts.put(i,0);}
            charCounts.put(i,charCounts.get(i)+1);
        }


        int oddCount = 0;

        for(char i:charCounts.keySet()){
            if(charCounts.get(i)%2==1){oddCount++;}
            if (oddCount>1){return false;}
        }
        return true;
    }
}

package com.boomer;

/**
 * Created by Omer on 3/30/2016.
 */

/*
 Find question at: https://www.glassdoor.com/Interview/Given-an-array-of-ints-6-4-0-5-0-0-0-1-0-move-all-non-zero-numbers-to-the-left-and-zeros-to-the-right-How-can-QTN_961526.htm
 */
public class MoveZeros {
    public static void process(int[] vals){
        int len = vals.length-1;

        for(int i = 0; i <len; i++){
            while(vals[len]==0){
                len--;
            }
            if(vals[i]==0){
                vals[i]=vals[len];
                vals[len]=0;
            }

        }

        for(int i  = 0; i < vals.length;i++){
            System.out.print(vals[i]);
        }
    }
}

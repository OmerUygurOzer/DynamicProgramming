package com.boomer;


import java.util.Arrays;

/**
 * Created by Omer on 3/31/2016.
 */

/*
   Find the question at: https://www.glassdoor.com/Interview/You-are-given-a-bunch-of-dominoes-Write-a-function-that-determines-if-any-two-of-those-dominoes-add-up-to-6-6-e-g-1-QTN_1375783.htm
 */
public class DominoSum {
    public static boolean findSix(int[][] dominoes){
        boolean [][] found = new boolean[6][6];
        for(int i = 0;i<6;i++){
            Arrays.fill(found[i],false);
        }

        for(int[] l : dominoes){
           if(found[6 - l[0]][6 - l[1]]){return true;}
           found[l[0]][l[1]]=true;
        }

        return false;
    }
}

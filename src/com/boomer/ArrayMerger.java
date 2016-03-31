package com.boomer;

/**
 * Created by Omer on 3/30/2016.
 */


public class ArrayMerger {

    /*
     Find question at: https://www.glassdoor.com/Interview/The-question-was-not-difficult-what-is-difficult-is-to-make-it-better-than-your-competitors-I-had-to-write-an-algorithm-QTN_787245.htm
   */
    public static int[] mergeTwoArrays(int[] ar1,int [] ar2){
        int[] newAr = new int[ar1.length + ar2.length];

        int ptr1 = 0;
        int ptr2 = 0;
        int ptrNew = 0;

        while(ptr1 <ar1.length && ptr2<ar2.length){
            if(ar1[ptr1]<ar2[ptr2]){
                newAr[ptrNew]=ar1[ptr1];
                ptr1++;
            }else{
                newAr[ptrNew]=ar2[ptr2];
                ptr2++;
            }
            ptrNew++;
        }

        for(int i :newAr){
            System.out.println(i);
        }
        return newAr;
    }


    public static int[] mergeNArrays(int[]... arrays){
        return null;
    }
}

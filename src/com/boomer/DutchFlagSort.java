package com.boomer;

/**
 * Created by Omer on 4/2/2016.
 */

/*
  Find the question at: https://www.glassdoor.com/Interview/Phone-screen-Given-a-list-of-numbers-and-a-function-that-returns-Low-Medium-or-High-sort-the-list-by-Lows-then-Mediums-QTN_1264972.htm
 */
public class DutchFlagSort {
    public static void sort(int [] ary){
        int l   = 0;
        int itr = 0;
        int len = ary.length-1;


        while(itr<=len){
            if(ary[itr]<1){
                swap(ary,itr,l);
                l++;
                itr++;
            }else if(ary[itr]>1){
                swap(ary,itr,len);
                len--;
            }else{
                itr++;
            }
        }

        for(int i = 0;i<ary.length;i++){
            System.out.print(ary[i]);
        }


    }


    //Complimentary to Dutch Flag Sort
    private static void swap(int[] arry , int a,int b) {
        int temp = arry[a];
        arry[a]=arry[b];
        arry[b]=temp;
    }

    //Complimentary to Dutch Flag Sort
    private static Pos getPos(int i){
        switch (i){
            case 3:
            case 15:
            case 23:
            case -1:
            case 7:
            case -3:
                return Pos.LOW;
            case 1:
            case 2:
            case -6:
            case -4:
            case 21:
            case 9:
                return Pos.MID;
            default:
                return Pos.HIGH;
        }
    }

    enum Pos{
        HIGH,
        MID,
        LOW;
    }
}


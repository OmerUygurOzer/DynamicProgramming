package com.boomer;

/**
 * Created by Omer on 4/2/2016.
 */

/*
  Find the question at: https://www.glassdoor.com/Interview/Behavior-past-project-and-what-s-the-funest-thing-in-it-1-Erase-duplicate-in-an-unsorted-array-2-Average-value-by-lev-QTN_1409825.htm
 */

    /*
    Kadane's algorithm
     */
public class SubArraySum {
    public static int findMax(int[] arr){

        int max_ending_here = 0;
        int max_so_far = 0;

        for(int i : arr){
            max_ending_here = Math.max(0,max_ending_here+i);
            max_so_far = Math.max(max_so_far,max_ending_here);
        }



        return max_so_far;
    }

    public static int findMin(int[] arr){
        int min_ending_here = 0;
        int min_so_far = 0;

        for(int i : arr){
            min_ending_here = Math.min(0,min_ending_here+i);
            min_so_far = Math.min(min_so_far,min_ending_here);
        }



        return min_so_far;
    }

}

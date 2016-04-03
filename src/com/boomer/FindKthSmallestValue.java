package com.boomer;

import java.util.PriorityQueue;
import java.util.Random;

/**
 * Created by Omer on 4/2/2016.
 */

/*
  Find the question at : https://www.glassdoor.com/Interview/How-would-you-quickly-find-the-kth-smallest-number-in-an-unsorted-array-QTN_1308792.htm
 */
public class FindKthSmallestValue {
    public static int findWithHeap(int[] arry, int k){
        PriorityQueue heap = new PriorityQueue();
        for(int i = 0;i<arry.length;i++){
            heap.add(arry[i]);
        }


        int kth = 0;
        for(int i = 0;i<k;i++){
            kth = (int)heap.remove();
        }

        return kth;
    }

    //Quickselect
    public static int findWithQS(int[] arry,int k){
        return quickSelect(arry,0,arry.length-1,k-1);
    }

    private static int quickSelect(int[] arry,int first, int last,int k){
        if (first <= last) {
            int pivot = partition(arry, first, last);
            if (pivot == k) {
                return arry[k];
            }
            if (pivot > k) {
                return quickSelect(arry, first, pivot - 1, k);
            }
            return quickSelect(arry, pivot + 1, last, k);
        }
        return Integer.MIN_VALUE;
    }

    //Complimentary to quick select
    private static int partition(int[] arry,int first,int last){
        int pivot = first + new Random().nextInt(last - first + 1);
        swap(arry,last,pivot);
        for(int i = first;i<last;i++){
            if(arry[i]>arry[last]){
                swap(arry,i,first);
                first++;
            }
        }
        swap(arry,first,last);
        return first;
    }

    //Complimentary to quick select
    private static void swap(int[] arry , int a,int b) {
        int temp = arry[a];
        arry[a]=arry[b];
        arry[b]=temp;
    }
}

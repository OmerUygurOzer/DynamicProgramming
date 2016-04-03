package com.boomer;

import java.util.Comparator;
import java.util.PriorityQueue;

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
                newAr[ptrNew++]=ar1[ptr1++];
            }else if(ar1[ptr1]>ar2[ptr2]){
                newAr[ptrNew++]=ar2[ptr2++];
            }else{
                newAr[ptrNew++]=ar1[ptr1++];
                newAr[ptrNew++]=ar2[ptr2++];
            }
        }

        while(ptr1<ar1.length){
            newAr[ptrNew++] = ar1[ptr1++];
        }

        while(ptr2<ar2.length){
            newAr[ptrNew++] = ar2[ptr2++];
        }

        for(int i :newAr){
            System.out.println(i);
        }
        return newAr;
    }


    /*
    Find the question at: https://www.glassdoor.com/Interview/1-give-2-time-obj-compare-which-time-is-earlier-2-merge-k-sorted-array-QTN_1401091.htm
     */

    public static int[] mergeNSortedArrays(int[]... arrays){
        int[] newArray = null;

        int totalSize = 0;
        for(int i = 0;i < arrays.length;i++){
            totalSize+=arrays[i].length;
        }

        newArray = new int[totalSize];

        PriorityQueue<Node> minHeap = new PriorityQueue<>(arrays.length,new NodeComparator());
        for(int i = 0;i < arrays.length;i++){
            minHeap.add(new Node(arrays[i][0],i,0));
        }

        int newPtr = 0;
        Node cur;

        while(minHeap.size()!=0){
            cur = minHeap.remove();
            newArray[newPtr] = cur.val;
            if(cur.index<arrays[cur.array].length-1){
                minHeap.add(new Node(arrays[cur.array][cur.index+1],cur.array,cur.index+1));
            }
            newPtr++;
        }


        return newArray;
    }

    private static class NodeComparator implements Comparator<Node>{

        @Override
        public int compare(Node o1, Node o2) {

            if(o1.val>o2.val){
                return 1;
            }

            if(o1.val<o2.val){
                return -1;
            }

            return 0;
        }
    }

    private static class Node{
        int val;
        int array;
        int index;
        Node(int val, int array,int index){
            this.val = val;
            this.array = array;
            this.index = index;
        }
    }
}

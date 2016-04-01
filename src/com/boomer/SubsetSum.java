package com.boomer;

import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by Omer on 3/31/2016.
 */
public class SubsetSum {
     public static boolean general(int[] set, int sum){

         boolean[][] calcTable = new boolean[set.length+1][sum+1];

         for(int i = 1;i<=sum;i++){
             calcTable[0][i]=false;
         }

         for(int i = 0;i<= set.length;i++){
             calcTable[i][0]=true;
         }

         for(int i = 1; i <= set.length ;i++){
             for(int j = 1; j<=sum;j++){
                calcTable[i][j] = calcTable[i-1][j];

                 if(!calcTable[i][j] && j>=set[i-1]){
                     calcTable[i][j] = calcTable[i][j] || calcTable[i-1][j-set[i-1]];
                 }

             }
         }


        return calcTable[set.length][sum];
     }


    /*
    Find the question at: https://www.glassdoor.com/Interview/1-Given-a-string-write-a-function-that-return-if-it-is-Palindrome-This-wasn-t-asked-directly-but-from-interviewer-example-QTN_840565.htm
     */

    public static boolean sumOfThree(int[] set,int sum){

        HashMap<Integer,HashSet<HashSet<Integer>>> sumMap = new HashMap<>();

        int key = 0;

        HashSet<Integer> negSums = new HashSet<>();

        for(int i = 0;i<set.length;i++){

        }


        for(int i = 0;i<set.length;i++){
            for(int j = i+1 ; j<set.length;j++){
               key = set[i]+set[j];
               if(sumMap.get(key)==null){sumMap.put(key,new HashSet<HashSet<Integer>>());}
                HashSet<Integer> vals = new HashSet<>();
                vals.add(i);
                vals.add(j);
                sumMap.get(key).add(vals);
            }
        }

        for(int i = 0;i<set.length;i++){
           if(sumMap.get(sum-set[i])==null){continue;}
           for(HashSet<Integer> s: sumMap.get(sum-set[i])){
               if(!s.contains(i)){return true;}
           }
        }



        return false;
    }

}

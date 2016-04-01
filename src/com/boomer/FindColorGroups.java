package com.boomer;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Omer on 3/30/2016.
 */

/*
  Find the question at: https://www.glassdoor.com/Interview/Given-an-n-n-matrix-filled-randomly-with-different-colors-no-limit-on-what-the-colors-are-add-up-the-total-number-of-gro-QTN_1452998.htm
 */
public class FindColorGroups {
    static int n;
    public static void find(int [][] canvas){
        n  = canvas.length;
        boolean[][] isOld = new boolean[n][n];
       for(int i = 0;i<n;i++){
           Arrays.fill(isOld[i],false);
       }

        Map<Integer,Integer> groups = new HashMap<>();

        for(int i = 0 ; i < n;i++){
            for(int j = 0; j < n; j ++ ){
                if(groups.get(canvas[i][j])==null){groups.put(canvas[i][j],0);}
                if(!isOld[i][j]){
                    process(canvas,isOld,i,j,canvas[i][j]);
                    groups.put(canvas[i][j],groups.get(canvas[i][j])+1);
                }
            }
        }

        System.out.println(groups);
    }


    public static void process(int[][] canvas,boolean[][] isOld,int i,int j,int val){
        System.out.println(val);
        if(canvas[i][j]==val && !isOld[i][j]){
            isOld[i][j]=true;}
        else{return;}

        if(i>0)  process(canvas,isOld,i-1,j,val);
        if(i<n-1)process(canvas,isOld,i+1,j,val);
        if(j>0)  process(canvas,isOld,i,j-1,val);
        if(j<n-1)process(canvas,isOld,i,j+1,val);
    }
}

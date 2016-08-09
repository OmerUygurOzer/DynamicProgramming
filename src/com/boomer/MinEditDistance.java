package com.boomer;

/**
 * Created by Omer on 8/8/2016.
 */

/*
 Find the quetion at : https://www.glassdoor.com/Interview/Edit-distance-of-words-and-distributed-system-questions-QTN_448733.htm
 */
public class MinEditDistance {

   private static int min(int case1,int case2,int case3){
        if(case1<case2 && case1<case3){return case1;}
        if(case2<case1 && case2<case3){return case2;}
        return case3;
    }

    public static int solve(String s1,String s2,int len1,int len2){

        int memo[][] = new int[len1+1][len2+1];

        for(int i = 0;i<=len1;i++){
            for(int j = 0;j<=len2;j++){
                if(i==0){memo[i][j]=j;}
                else if(j==0){memo[i][j]=i;}
                else if(s1.charAt(i-1) == s2.charAt(j-1)){
                    memo[i][j]=memo[i-1][j-1];}
                else{
                    memo[i][j]= 1+min(memo[i][j-1],memo[i-1][j],memo[i-1][j-1]);
                }
            }
        }


        return memo[len1][len2];
    }


}

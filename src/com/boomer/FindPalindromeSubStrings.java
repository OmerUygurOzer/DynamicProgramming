package com.boomer;


import java.util.HashSet;
import java.util.Set;

/**
 * Created by Omer on 3/30/2016.
 */

/*
 Modified Manacher's Algorithm O(n) solution
 Find question at: https://www.glassdoor.com/Interview/implement-a-function-to-find-if-a-given-string-is-a-palindrome-Implement-a-function-to-find-all-palindrome-substring-in-a-QTN_1436278.htm
 */

//Modified Manacher's Algorithm O(n) solution

public class FindPalindromeSubStrings {
    public static void process(String s){
        Set<String> palindromes = new HashSet<>();

        int sLen = s.length();

        s="|"+s+"|";
        System.out.println(s);


        int[][] lens = new int[2][s.length()+1];

        for(int i = 0; i <=1;  i ++){

            int radius = 0;
            lens[i][0] = 0;

            int j = 1;

            while(j<=sLen){
                while(s.charAt(j-radius-1)==s.charAt(j+i+radius)){
                    radius++;
                    if(j-radius-1 < 0)break;
                    if(j+i+radius == s.length())break;
                }

                lens[i][j] = radius;
                int k = 1;
                while (lens[i][j-k]!=radius-k && k<radius){
                    lens[i][j+k]=Math.min(lens[i][j-k],radius-k);
                    k++;
                }

                j+=k;
                radius = Math.max(radius-k,0);

            }

        }

        s = s.substring(1,s.length()-1);
        System.out.println(s);
        for (int i= 0;i<s.length();i++){
            System.out.println(i+"==>"+lens[1][i]);
            palindromes.add(String.valueOf(s.charAt(i)));
            palindromes.add(s.substring(i-lens[1][i],i+lens[1][i]));
            palindromes.add(s.substring(i-lens[1][i],i+lens[1][i]));
        }
        System.out.println(palindromes);



    }
}

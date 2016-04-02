package com.boomer;

import java.util.HashSet;

/**
 * Created by Omer on 4/1/2016.
 */

/*
  Find the question at: https://www.glassdoor.com/Interview/Facebook-Software-Engineer-Interview-Questions-EI_IE40772.0,8_KO9,26_IP3.htm
 */
public class EraseDuplicatesInArray {
    public static void erase(int[] arr){
        HashSet<Integer> found = new HashSet<Integer>();
            for(int i = 0; i < arr.length;i++){
                if(found.contains(arr[i])){
                    arr[i]=-1;
                }else{
                    found.add(arr[i]);
                }
            }

    }
}

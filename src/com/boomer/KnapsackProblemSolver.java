package com.boomer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Omer on 3/26/2016.
 */
public class KnapsackProblemSolver {
    private static final int MAX_VAL = 20;
    private static final int MIN = 0;

    public static List<Integer> solve(int capacity,int itemCount){
        List<Integer> returner = new ArrayList<>();
        Random random = new Random();

        int [] itemWeight = new int[itemCount];
        int [] itemVal   = new int[itemCount];

        for(int i = 0;i<itemCount;i++){
            itemWeight[i] = random.nextInt((capacity - MIN) + 1) + MIN;
            itemVal[i]    = random.nextInt((MAX_VAL - MIN) + 1) + MIN;
            System.out.println("w:"+itemWeight[i] + "   v:"+itemVal[i]);
        }

        int     [][] valArray = new int[itemCount+1][capacity+1];
        boolean [][] keepArray = new boolean[itemCount+1][capacity+1];




        return returner;
    }
}

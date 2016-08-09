package com.boomer;

import java.util.HashMap;

/**
 * Created by Omer on 4/10/2016.
 */

/*
 This was asked to me at an interview with Uber.

 The question was to implement a T9 interface. A method accepts all buttons pressed and prints out the combination of possible outputs.
 */

public class T9Combinator {
    private static final HashMap<Character,char[]> t9Map = new HashMap<>();

    static{
        char[] map2 = new char[]{'a','b','c'};
        char[] map3 = new char[]{'d','e','f'};
        char[] map4 = new char[]{'g','h','i'};
        char[] map5 = new char[]{'j','k','l'};
        char[] map6 = new char[]{'m','n','o'};
        char[] map7 = new char[]{'p','q','r','s'};
        char[] map8 = new char[]{'t','u','v'};
        char[] map9 = new char[]{'w','x','y','z'};
        t9Map.put('2',map2);
        t9Map.put('3',map3);
        t9Map.put('4',map4);
        t9Map.put('5',map5);
        t9Map.put('6',map6);
        t9Map.put('7',map7);
        t9Map.put('8',map8);
        t9Map.put('9',map9);
    }


    public static void getT9Combo(String input){
        char[] inputs = input.toCharArray();
        combinator(inputs, "",0);
    }


    /*
    Complimentary to above method
     */
    private static void combinator(char[] inputs,String s, int index){

        for(char c: t9Map.get(inputs[index])){
            if(index<inputs.length-1){
                combinator(inputs,s+c,index+1);
            }else{
                System.out.println(s+c);
            }
        }
    }

}

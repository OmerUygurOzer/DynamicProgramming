package com.boomer;

import java.util.*;

/**
 * Created by Omer on 3/30/2016.
 */

/*
 Find the question at: https://www.glassdoor.com/Interview/Given-a-set-of-random-strings-write-a-function-that-returns-a-set-that-groups-all-the-anagrams-together-Ex-star-dog-ca-QTN_1452291.htm
 */
public class AnagramFinder {
    public List<String> stringList = new ArrayList<>();

    public void add (String s){
        stringList.add(s);
    }

    public Collection<Set<String>> findAnagrams(){
        HashMap<String,Set<String>> map = new HashMap<>();
        for(String s:stringList){
            if(map.get(getKey(s))==null){map.put(getKey(s),new HashSet<>());}
            map.get(getKey(s)).add(s);
        }
        return  map.values();
    }

    private String getKey(String s){
        char []c = s.toCharArray();
        Arrays.sort(c);
        return String.valueOf(c);
    }

}

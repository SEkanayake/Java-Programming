package com.java_programming.problem_solving.basic;

import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
public class CountString {

    public void countWords(){

        String val = "Hello World";

        String[] starr = val.split(" ");
        System.out.println("count words:::" + starr.length);
    }

    public void countCharacters(){

        String val = "Hello";

        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for(int i =0; i<val.length(); i++){
            char ch = val.charAt(i);
            String key = String.valueOf(ch);
            if(map.get(key) == null){
                map.put(key, 1);
            }else {
                map.put(key, map.get(key)+1);
            }
        }

        System.out.println("count of letters :: " +map);
    }
}

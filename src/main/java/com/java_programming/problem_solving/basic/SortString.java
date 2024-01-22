package com.java_programming.problem_solving.basic;

import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class SortString {

    public void getSort(){

        String name = "Sarala Ekanayake";

        char[] ch = name.toCharArray();
        Arrays.sort(ch);
        System.out.println(ch);
    }
}

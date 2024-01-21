package com.java_programming.problem_solving.basic;

import org.springframework.stereotype.Component;

@Component
public class ReverseString {

    public void byUsingStringBufferAndStringBuilder(){

        String word = "Sarala";

        StringBuffer rev1 = new StringBuffer(word).reverse();
        System.out.println("Reverse a string using a StringBuffer ::" + rev1);

        StringBuilder rev2 = new StringBuilder(word).reverse();
        System.out.println("Reverse a string using a StringBuilder ::" + rev2);
    }
}

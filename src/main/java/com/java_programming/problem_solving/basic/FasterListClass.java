package com.java_programming.problem_solving.basic;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.LinkedList;

@Component
public class FasterListClass {

    public void searchOption(){

        ArrayList<Integer> list = new ArrayList<Integer>();
//        LinkedList<Integer> list = new LinkedList<Integer>();

        for (int i=1; i<10000; i++){
            list.add(i);
        }

        Long startTime = System.currentTimeMillis();
        System.out.println(list.get(10));
        System.out.println(list.get(1000));
        System.out.println(list.get(9000));

        Long endTime = System.currentTimeMillis();
        System.out.println("running time ::" + (endTime - startTime));
    }
}

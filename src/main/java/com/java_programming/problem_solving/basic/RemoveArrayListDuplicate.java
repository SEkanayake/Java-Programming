package com.java_programming.problem_solving.basic;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

@Component
public class RemoveArrayListDuplicate {

    public void removeDuplicateInteger(){

        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(6);
        arr.add(3);
        arr.add(4);
        arr.add(3);

        // arrayList can have duplicates
        System.out.println("original array :::" + arr);

        // Remove duplicates
        Set<Integer> linkedset = new LinkedHashSet<Integer>(arr);
        System.out.println("LinkedHashSet result :::" + linkedset);

        // Remove duplicates and sort the array
        Set<Integer> hashset = new HashSet<Integer>(arr);
        System.out.println("LinkedHashSet result :::" + hashset);


    }
}

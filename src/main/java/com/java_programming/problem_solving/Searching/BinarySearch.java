package com.java_programming.problem_solving.Searching;

import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class BinarySearch {

    public void getValue(){

        int[] arr = {10, 20, 30, 40, 50, 60, 70};
        int searchKey = 10;
        Arrays.sort(arr);

        int val = searchVal(arr, searchKey);
        System.out.println("Index of "+ searchKey + " is "+ val);
    }

    int searchVal(int[] array, int input) {

        int start = 0;
        int last = array.length - 1;
        while (start <= last) {
            int middle = (start + last) / 2;
            if (array[middle] == input) {
                return middle;
            } else if (array[middle] > input) {
                last = middle - 1;
            } else if (array[middle] < input) {
                start = middle + 1;
            }
        }
        return -1;
    }
}

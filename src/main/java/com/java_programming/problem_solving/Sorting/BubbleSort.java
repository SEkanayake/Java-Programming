package com.java_programming.problem_solving.Sorting;

import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.util.Arrays;

@Component
public class BubbleSort {

    public void sort(){

        int[] arr = {2, 32, 56, 8, 25, 10};

        for(int i=arr.length-1; i>0; i--){
            for (int j=0; j<i; j++){
                if(arr[j]> arr[j+1]){

                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

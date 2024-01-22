package com.java_programming.problem_solving.SimpleProgramming;

import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class Factorial {

    public void factValue(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter a number");
        int num = sc.nextInt();
        int result = num;

        for (int i=num-1; i>1; i--){
            result = result*i;
        }
        System.out.println("Factorial Number is "+ result);
    }
}

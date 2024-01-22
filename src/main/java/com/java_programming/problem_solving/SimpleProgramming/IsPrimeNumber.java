package com.java_programming.problem_solving.SimpleProgramming;

import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class IsPrimeNumber {

    public void isPrime(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter a number");
        int num = sc.nextInt();
        boolean isPrimeNum = true;

        for (int i = 2; i< num; i++){
            if( num % i == 0){
                isPrimeNum = false;
                break;
            }
        }
        if(isPrimeNum){
            System.out.println(num +" Is a prime Number");
        } else {
            System.out.println(num +" Is not a prime Number");
        }
    }
}

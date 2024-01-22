package com.java_programming.problem_solving.SimpleProgramming;

import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class ArmstrongNumber {

    public void isArmstrong(){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number ::");
        int number = sc.nextInt();
        int output = 0;

        int original_number = number;

        while (number > 0){
            int rem = number % 10;
            number = number / 10;
            output += Math.pow(rem, 3);
        }
        System.out.println("original Number:: "+ original_number+ " Armstrong Number :: "+output);
    }


}

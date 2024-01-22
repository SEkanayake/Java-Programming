package com.java_programming.problem_solving.SimpleProgramming;

import org.springframework.stereotype.Component;

@Component
public class Fibonacci {

    static int f1 = 0, f2 = 1, f3 = 0;
    public void getFibonacciWithRecursion(){
        int num = 10;
        System.out.print(f1 + " " +f2);
        fib(num-2);
        System.out.println();
    }

    void fib(int num){

        if(num>0){
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
            System.out.print(" "+f3);
            fib(num-1);
        }
    }

    public void fibonacciWithoutRecursion(){
        int n1=0,n2=1,n3,i,count=10;
        System.out.print(n1+" "+n2);

        for(i=2;i<count;++i)
        {
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }

    }
}

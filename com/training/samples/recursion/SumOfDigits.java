package com.training.samples.recursion;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(new SumOfDigits().sum(26587));
    }

    public int sum(int n){
        if(n<10)
            return n;
        else
            return sum(n/10)+n%10;
    }
}

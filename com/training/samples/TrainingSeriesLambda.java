package com.training.samples;

public class TrainingSeriesLambda {

    public static void main(String[] args) {

        Printer print=(a,b)-> {
            if(a<b)
                throw new RuntimeException();
            else
                return a-b;
        };
        System.out.println(print.subtract(30,20));
        //print.doPrint();
    }

    public interface Printer{
        //void doPrint();
        int subtract(int a, int b);
    }
}

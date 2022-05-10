package com.training.samples.recursion;

public class BaseConversion {
    public static void main(String[] args) {
        new BaseConversion().convert(13,2);
    }
    public void convert(int n,int base){
        if(n ==0) {
            return;
        }
        else{
            convert(n/base,base);
            int reminder=n%base;
            if(reminder<10)
                System.out.print(reminder);
            else
                System.out.print((char)(reminder-10+'A'));
        }
    }
}

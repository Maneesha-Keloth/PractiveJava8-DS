package com.training.samples.math;

public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(new ReverseInteger().reverse(-35442));
    }
    public int reverse(int x) {
        boolean negative=false;
        if(x<0){
            negative = true;
            x=-1*x;
        }
        long reverse = 0;

        while(x!=0){
            reverse=reverse*10+x%10;
            x=x/10;
        }
        if(reverse < Integer.MIN_VALUE || reverse > Integer.MAX_VALUE)
            return 0;
        if(negative)
            reverse = -1* reverse;
        return (int) reverse;

    }
}

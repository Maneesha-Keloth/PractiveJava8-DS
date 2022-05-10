package com.training.samples.buycell;

public class SingleNumber {

    public int singelNum(int[] nums){
        int result =0;

        for(int num:nums){
            result=result^num;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new SingleNumber().singelNum(new int[]{4,1,2,1,2}));
    }
}

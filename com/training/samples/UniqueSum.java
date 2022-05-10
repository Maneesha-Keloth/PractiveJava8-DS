package com.training.samples;

import java.util.*;

public class UniqueSum {
    public static void main(String[] args) {
        System.out.println(new UniqueSum().sum(Arrays.asList(1,2,3,1,6)));
    }

    public int sum(List<Integer> arr){
       Map<Integer,Integer> map= new HashMap<>();
       int sum=0;
       for(int i=0;i< arr.size();i++){
           int num=arr.get(i);
           if(map.containsKey(num)){
               map.put(num,-1);
           }else{
               sum+=num;
               map.put(num,i);
           }
       }
       for(int num: map.keySet()){

       }
       return sum;
    }
}

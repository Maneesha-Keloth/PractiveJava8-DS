package com.training.samples.buycell;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FirstUnique {
    public int firstUnique(String s){
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0; i<s.length();i++){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),i);
            }else{
                map.put(s.charAt(i),-1);
            }
        }
        int min=Integer.MAX_VALUE;
        for(Integer i:map.values()){
            if(i<min && i >-1){
                min=i;
            }
        }
        return min==Integer.MAX_VALUE?-1:min;
    }

    public static void main(String[] args) {
        System.out.println(new FirstUnique().firstUnique("manemna"));
    }
}

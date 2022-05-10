package com.training.samples.buycell;

import java.util.HashMap;
import java.util.Map;

public class CheckDuplicate {
    public boolean checkDuplicate(int[] array){
        boolean duplicate =false;
        Map<Integer,Boolean> visitMap= new HashMap<>();
        for(int i=0; i<array.length;i++){
            if(visitMap.get(array[i]) ==null || (boolean) visitMap.get(array[i]) != true){
                visitMap.put(array[i],true);
            }else{
                duplicate=true;
                break;
            }
        }
        return duplicate;
    }

    public static void main(String[] args) {
        System.out.println(new CheckDuplicate().checkDuplicate(new int[]{3, 4, 5, 3, 7, 8}));
    }
}

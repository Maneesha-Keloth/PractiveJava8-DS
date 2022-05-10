package com.training.samples.buycell;

import java.util.ArrayList;
import java.util.List;

public class FizBuz {

    public List<String> fizBuz(int n){
        List<String> results=new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(i%3==0 && i%5==0)
                results.add("FIZBUZ");
            else if(i%3==0)
                results.add("FIZ");
            else if(i%5==0)
                results.add("BUZ");
            else
                results.add(String.valueOf(i));
        }
        return results;
    }
    public static void main(String[] args) {
        System.out.println(new FizBuz().fizBuz(15));
    }
}

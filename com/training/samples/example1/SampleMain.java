package com.training.samples.example1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SampleMain {

    public static void main(String args[]){
        List<Integer> numList= Arrays.asList(1,2,3,4,5,3);
        //numList.forEach(System.out::println);
        //numList.forEach(String::valueOf);
        System.out.println(numList.stream().map(String::valueOf).collect(Collectors.toList()));

        System.out.println(numList.stream()
                .filter(num->num%2==0).collect(Collectors.toList()));
        System.out.println(numList.stream()
                .filter(num->num%2==0)
                .map(num->num*2).collect(Collectors.toList()));
        System.out.println(numList.stream()
                .filter(num->num%2==0)
                .map(num->num*2)
                .reduce(0,Integer::sum));
        System.out.println(numList.stream()
                .filter(num->num%2==0)
                .mapToInt(num->num*2)
                .sum());

    }
}

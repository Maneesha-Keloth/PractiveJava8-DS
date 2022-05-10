package com.training.samples.demo1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {

    public static void main(String[] args) {
        Predicate<Integer> predicate= num-> num%2==0;

        System.out.println(predicate.test(12));
        List<Integer> integerList= Arrays.asList(1,2,3,4,5,6);
        integerList.stream()
                .filter(predicate)
                .forEach(System.out::println);
    }
}

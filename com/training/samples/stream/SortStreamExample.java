package com.training.samples.stream;

import com.training.samples.example1.lambda.Customer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortStreamExample {
    public static void main(String[] args) {
        List<Integer> integerList= Arrays.asList(1,8,0,6,44);
        System.out.println(integerList.stream()
                .sorted().collect(Collectors.toList()));
        System.out.println(integerList.stream()
                .sorted(Comparator.reverseOrder()).collect(Collectors.toList()));

        List<Customer> customerList= new ArrayList<>();
        customerList.add(new Customer("Tom","Kerala"));
        customerList.add(new Customer("Mary","Karnataka"));
        customerList.add(new Customer("John","Delhi"));
        customerList.add(new Customer("Jim","Tamil Nadu"));

        customerList.stream()
                .sorted((e1,e2)->e1.name.compareTo(e2.name))
                .forEach(System.out::println);
        customerList.stream()
                .sorted(Comparator.comparing(Customer::getName))
                .forEach(System.out::println);
    }
}

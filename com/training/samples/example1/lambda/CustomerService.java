package com.training.samples.example1.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomerService {

    public List<Customer> getAllCustomers(){

        List<Customer> customerList= new ArrayList<>();
        customerList.add(new Customer("Tom","Kerala"));
        customerList.add(new Customer("Mary","Karnataka"));
        customerList.add(new Customer("John","Delhi"));
        customerList.add(new Customer("Jim","Tamil Nadu"));
        Collections.sort(customerList, (o1,o2)->o1.name.compareTo(o2.name));
        return customerList;
    }
}

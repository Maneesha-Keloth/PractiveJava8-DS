package com.training.samples.example1.lambda;

public class Customer {

    public Customer(String name,String address){
        this.name=name;
        this.address=address;
    }
    public String name;
    public String address;

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}

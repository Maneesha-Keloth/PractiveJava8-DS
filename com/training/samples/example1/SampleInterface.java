package com.training.samples.example1;

@FunctionalInterface
public interface SampleInterface {
     void test();

    default void printMe() {
        System.out.println("default print");
    }

    static void help(){
       System.out.println("static help");
    }
}

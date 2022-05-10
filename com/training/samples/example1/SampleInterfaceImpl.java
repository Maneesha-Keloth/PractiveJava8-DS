package com.training.samples.example1;

public class SampleInterfaceImpl implements SampleInterface{


    @Override
    public void test() {
        System.out.println("test");
    }

    public static void main(String[] args) {
        SampleInterface sampleInterface=new SampleInterfaceImpl();
        sampleInterface.printMe();
        sampleInterface.test();
        SampleInterface.help();
    }
}

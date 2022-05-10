package com.training.samples;



public class Child extends Parent{


    public void doPrint() throws Exception{
        System.out.println("Hello This is from child");
    }


    public static void main(String[] args) {
        Parent parent=new Child();
        //parent.doPrint();
    }
}

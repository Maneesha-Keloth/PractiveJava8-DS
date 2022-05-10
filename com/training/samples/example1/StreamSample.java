package com.training.samples.example1;

import java.util.Arrays;
import java.util.List;
import static java.util.stream.Collectors.*;

public class StreamSample {

    private static List<Person> createPeople(){
        return Arrays.asList(new Person("June",31,"Female"),
                new Person("John",29,"Male"),
                new Person("Mary",35,"Female"),
                new Person("James",31,"Male"),
                new Person("John",34,"Male")
                );
    }

    public static void main(String args[]){
        List<Person> personList=createPeople();

        System.out.println(personList.stream()
                .collect(toMap(
                        person -> person.getName()+"-"+person.getAge(),
                        person -> person
                )));
        System.out.println(personList.stream()
                .collect(groupingBy(Person::getName)));

        System.out.println(personList.stream()
                .collect(groupingBy(Person::getName,
                        mapping(Person::getAge,toList()))));
    }

}

package com.training.samples.regex;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ExamQuestion {
    public static void main(String[] args) {
        try(Scanner scanner=new Scanner(System.in)){
            String line = scanner.nextLine();
            String regex= "[^a-zA-Z0-9\\s]";
            String modifiedLine = line.replaceAll(regex,"");
            String[] words = modifiedLine.split("[\\s]+");
            Map<Integer,String> map= new TreeMap<>();
            for(String word: words){
                System.out.println(word);
                String[] chars = word.split("");
                int sum = 0;
                for(String c: chars){
                    if(c.matches("[0-9]")){
                        sum+=Integer.parseInt(c);
                    }
                }
                map.put(sum,word);
            }
            map.entrySet().stream().forEach(System.out::println);
        }
    }
}

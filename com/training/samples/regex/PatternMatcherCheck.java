package com.training.samples.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class PatternMatcherCheck {
    public static void main(String[] args) {
        try(Scanner scanner=new Scanner(System.in)){
            while(true) {
                System.out.println("Enter the regex:");
                String input = scanner.nextLine();
                Pattern pattern = Pattern.compile(input);
                Matcher matcher = pattern.matcher("Welcome to My Coding World");
                while(matcher.find()){
                    System.out.println("Found "+matcher.group()+" starting at "+
                            matcher.start()+" ending at "+matcher.end());
                }
            }
        }
    }
}

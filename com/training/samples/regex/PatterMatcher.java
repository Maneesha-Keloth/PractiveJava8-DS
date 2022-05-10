package com.training.samples.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatterMatcher {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("^[a-zA-Z]+$");
        Matcher matcher = pattern.matcher("a");
        /*System.out.println(matcher.matches());//true


        System.out.println(Pattern.matches("^[a-z]{0,2}$","ab")); //true
        System.out.println(Pattern.matches("[ayz]?","ayz")); //false
        System.out.println(Pattern.matches("[ayz]+","a")); //true
        System.out.println(Pattern.matches("[ayz]*","")); //true
        System.out.println(Pattern.matches("[^ayz]+","")); //true*/

        Pattern p=Pattern.compile("\\b(\\w+)(?:\\W+\\1\\b)+",Pattern.CASE_INSENSITIVE);
        Matcher m=p.matcher("Hello hello Maneesha Maneesha");
        while(m.find()){
            System.out.println(m.group());
            System.out.println(m.group(1));
        }
    }
}

package com.training.samples.buycell;

import java.util.Stack;

public class ValidParenthesis {

    public static void main(String[] args) {
        System.out.println(new ValidParenthesis().valid("{}"));
    }

    public boolean valid(String s){
        boolean valid = true;
        char[] chars=s.toCharArray();
        Stack<Character> stack=new Stack<>();
        for(char c:chars){
            if(c=='{' || c=='(' || c =='['){
                stack.push(c);
            }
            if(c=='}' || c==')' || c ==']'){
                if(!stack.isEmpty()){
                    char tmp= stack.pop();
                    if(c=='}' && tmp!='{') {
                        valid = false;
                        break;
                    }
                    if(c==']' && tmp!='[') {
                        valid = false;
                        break;
                    }
                    if(c==')' && tmp!='(') {
                        valid = false;
                        break;
                    }
                }else{
                    valid=false;
                    break;
                }
            }
        }
        if(!stack.isEmpty())
            valid=false;
        return valid;
    }
}

package com.training.samples.linkedlist;

import java.util.HashMap;
import java.util.Map;

public class UniqueString {
        public int lengthOfLongestSubstring(String s) {
            char[] str = s.toCharArray();
            int maxlength = 0;
            int len=str.length;
            for(int i=0; i<len; i++){
                for(int j=i; j<len; j++){
                    if(checkUnique(str,i,j) == true){
                        maxlength = Math.max(maxlength, j-i+1);
                    }
                }
            }
            return maxlength;

        }

        boolean checkUnique(char[] str, int i, int j){
            Map<Character,Boolean> map = new HashMap<>();
            for(int k=i; k<=j; k++){
                if(map.get(str[k]) != null && (Boolean) map.get(str[k])== true){
                    return false;
                }
                map.put(str[k],true);
            }
            return true;
        }

    public static void main(String[] args) {
        System.out.println(new UniqueString().lengthOfLongestSubstring("pwwkew"));
    }
}

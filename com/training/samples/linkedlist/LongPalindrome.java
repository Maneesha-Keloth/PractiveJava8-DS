package com.training.samples.linkedlist;

public class LongPalindrome {
        public String longestPalindrome(String s) {
            int n = s.toCharArray().length;
            int maxlength=1;
            int start =0;
            for(int i=0; i<n; i++){
                for(int j=i; j<n; j++){
                    Boolean p=true;
                    //check for palindrome
                    for(int k=0;k<(j-i+1)/2;k++){
                        if(s.charAt(i+k) != s.charAt(j-k))
                            p=false;
                    }

                    if(p == true && j-i+1 > maxlength){
                        start =i;
                        maxlength=j-i+1;
                    }
                }
            }
            //System.out.println(start);
            //System.out.println(maxlength);
            return s.substring(start,start+maxlength);
        }

    public static void main(String[] args) {
        System.out.println(new LongPalindrome().longestPalindrome("abba"));
    }
}

package com.tgt.igniteplus;

public class javaChallenge20 {
    public static void main(String[] args) {
        String s= "I am always ready to learn although I do not always like being taught.";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='a')
                s=s.substring(0,i)+'$'+s.substring(i+1);
        }

        System.out.println(s);
    }
}

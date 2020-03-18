package com.tgt.igniteplus;

import java.util.*;
import java.util.regex.Pattern;
public class javaChallenge14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter text");
        String text=sc.nextLine();
        System.out.println("Enter pattern");
        //String pattern = ".*string.*";
        String pattern=sc.nextLine();
        String p=(".*".concat(pattern)).concat(".*");
        boolean matches= Pattern.matches(p,text);
        if(matches==true)
            System.out.println(" First contains second ");
        else
            System.out.println(" First  doesn't contain second ");
    }
}
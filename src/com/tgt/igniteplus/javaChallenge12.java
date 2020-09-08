package com.tgt.igniteplus;

import java.util.Scanner;
// concatenate two strings
public class javaChallenge12 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        String a,b;
        System.out.println("Enter string 1");
        a=s.next();
        System.out.println("Enter string 2");
        b=s.next();
        System.out.println("Concatenated string: "+a.concat(b));
    }
}

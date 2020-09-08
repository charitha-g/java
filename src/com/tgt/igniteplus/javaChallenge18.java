package com.tgt.igniteplus;

import java.util.Scanner;
// calculate the largest number from the given three numbers using ternary operator
public class javaChallenge18 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter 3 unequal numbers");
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        int largest;
        largest=(a>b)?(a>c?a:c):(b>c?b:c);
        System.out.println("Largest = "+largest);
    }
}

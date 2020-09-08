package com.tgt.igniteplus;

import java.util.Scanner;
// to check if input year is leap year or not
public class javaChallenge6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a year");
        int n=sc.nextInt();
        if((n%4==0 && n%100!=0) || (n%100==0 && n%400==0))
            System.out.println(n+" is a Leap year");
        else
            System.out.println(n+" is not a Leap year");
    }
}

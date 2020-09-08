package com.tgt.igniteplus;

import java.util.Scanner;
// to find the ASCII value of the character
public class javaChallenge4
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        char ch;
        System.out.println("Enter a character");
        ch=s.next().charAt(0);
        int ascii=(int)ch;
        System.out.println("The ascii value of "+ch+" is "+ascii);
    }
}

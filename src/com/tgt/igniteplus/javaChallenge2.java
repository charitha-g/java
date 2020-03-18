package com.tgt.igniteplus;

import java.util.Scanner;

public class javaChallenge2
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        float r,h;
        System.out.println("Enter the radius and height of the cylinder");
        r=sc.nextFloat();
        h=sc.nextFloat();
        double v= 3.14*r*r*h;
        System.out.println("The volume of the cylinder is "+v+".");
    }
}
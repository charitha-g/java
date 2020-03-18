package com.tgt.igniteplus;

import java.util.Scanner;
public class javaChallenge7
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n=sc.nextInt();
        int []a=new int[n];
        int i;
        float avg=0;
        System.out.println("Enter the elements");
        for(i=0;i<n;i++)
            a[i]=sc.nextInt();
        for(i=0;i<n;i++)
            avg+=a[i];
        avg/=n;
        System.out.println("The average is "+avg);
    }
}
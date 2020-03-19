package com.tgt.igniteplus;

import java.util.Scanner;
public class javaChallenge19
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=sc.nextInt();
        int ans=isUgly(n);
        if(ans == 1)
            System.out.println("This is an ugly number" );
        else
            System.out.println("This is not an ugly number");
    }
    static int maxDividingPower(int a, int b)
    {
        while (a%b == 0)
            a=a/b;
        return a;
    }

    static int isUgly(int num)
    {
        num=maxDividingPower(num,2);
        num=maxDividingPower(num,3);
        num=maxDividingPower(num,5);

        return (num==1)?1:0;
    }
}
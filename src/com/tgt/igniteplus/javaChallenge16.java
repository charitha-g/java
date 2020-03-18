package com.tgt.igniteplus;

import java.util.Scanner;
public class javaChallenge16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str=sc.nextLine();
        int i,j;
        System.out.println("Duplicate characters: ");
        for(i=0;i<str.length();i++)
        {
            for(j=i+1;j<str.length();j++)
            {
                if(str.charAt(j)==str.charAt(i))
                    System.out.print(str.charAt(i)+" ");
            }
        }
    }
}

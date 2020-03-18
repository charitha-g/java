package com.tgt.igniteplus;
import java.util.Scanner;

// count the number words in a string
public class javaChallenge13 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String a;
        System.out.println("Enter a string");
        a=s.nextLine();
        char[] ch=new char[a.length()];
        int words=1;
        for(int i=0;i<a.length();i++)
        {
            ch[i]=a.charAt(i);
            if(ch[i]==' ' && i!=0 && i!=a.length()-1)
                words++;
        }
        System.out.println(words);
    }
}
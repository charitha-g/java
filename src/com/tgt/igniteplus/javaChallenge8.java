package com.tgt.igniteplus;

import java.io.File;
import java.io.IOException;
public class javaChallenge8 {
    public static void main(String[] args) throws IOException
    {
        try
        {
            File f=new File("Sample.txt");
            if(f.createNewFile())
                System.out.println("File has been created "+f.getName());
            else
                System.out.println("File already exists");
        }
        catch (IOException e)
        {
            System.out.println("Error");
        }
    }
}
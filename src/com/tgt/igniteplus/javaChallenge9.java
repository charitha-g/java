package com.tgt.igniteplus;

import java.io.FileOutputStream;
import java.io.FileOutputStream;
public class javaChallenge9
{
    public static void main(String[] args)
    {
        try{
            FileOutputStream fout=new FileOutputStream("C:\\Users\\Dell\\IdeaProjects\\project1\\Sample.txt");
            fout.write(65);
            fout.close();
            System.out.println("done");
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
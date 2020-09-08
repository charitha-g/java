package com.tgt.igniteplus;

import java.io.*;
// to copy data from one file to another file
public class javaChallenge10
{
    public static void main(String[] args) throws FileNotFoundException,IOException
    {
        FileInputStream fis = new FileInputStream(args[0]);
        FileOutputStream fos=new FileOutputStream(args[1]);
        int b;
        while ((b=fis.read())!=-1)
            fos.write(b);
        fis.close();
        fos.close();
    }
}


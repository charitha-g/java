package com.tgt.igniteplus;

// A pen costs 50$ and it is been sold at a discount of 12%, Write a program to display discount amount and selling price of the pen
public class javaChallenge3
{
    public static void main(String[] args) {
        int cost=50;
        double discount=0.12;
        double discountamount=discount*cost;
        double sellingprice=cost-discountamount;
        System.out.println("Cost = "+cost+"\nDiscount = "+discount+"\nDiscount Amount = "+discountamount+"\nSelling price = "+sellingprice);
    }
}

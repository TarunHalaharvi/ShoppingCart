package com.tarun.lrn;

import java.util.Scanner;

public class salesTax {
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the price");
        double price = scanner.nextDouble();
        System.out.println("is it book/medicine/food");
        boolean b = scanner.nextBoolean();
        System.out.println("Enter The Quantity");
        int qty = scanner.nextInt();

        double salesTax = (price*10)/100;
        double sellingprice = price * qty;
        if(b == true)
        {
            System.out.println("Total Price to be paid"+price);
        }
        else
        {
           double total = tax(sellingprice,salesTax);
           System.out.println("Total Price to be paid"+total);
        }
    }
    private static double tax(double price,double salesTax)
    {
        return price + salesTax;
    }
}


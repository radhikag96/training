package com.knoldus.radhika;

import java.util.*;
public class Converter {
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the currency to be converted :\n");
        String currency1=sc.nextLine();
        System.out.println("enter the currency to convert in :\n");
        String currency2=sc.nextLine();
        System.out.println("enter the amount to be converted\n");
        double amount=sc.nextDouble();
        double currency=0;
        if(currency1.equals("INR"))
            currency=INR.findCurrency2(currency2,amount);
        if(currency1.equals("EURO"))
            currency=Euro.findCurrency2(currency2,amount);
        if(currency1.equals("Usdollar"));
        currency=Usdollar.findCurrency2(currency2,amount);
        if(currency1.equals("Hkdollar"))
            currency=Hkdollar.findCurrency2(currency2,amount);
        if(currency1.equals("Dirham" ))
            currency=Dirham.findCurrency2(currency2,amount);
        System.out.println("Converted Currency: "+currency);

    }
}

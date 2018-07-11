package com.knoldus.radhika;

public class Hkdollar {
    public static double findCurrency2(String currency2,double amt) {
        Hkdollar hd=new Hkdollar();
        double amount=0;
        if(currency2.equals("INR"))
            amount=hd.convertHkdollarInr(amt);
        if(currency2.equals("Usdollar"))
            amount= hd.convertHkdollarUsdollar(amt);
        if(currency2.equals("Dirham"))
            amount= hd.convertHkdollarDirham(amt);
        if(currency2.equals("Euro"))
            amount=hd.convertHkdollarEuro(amt);
        return amount;
    }


    private double convertHkdollarInr(double amt)
    {
        amt = amt*8.76;
        return amt;
    }
    private double convertHkdollarUsdollar(double amt)
    {
        amt = amt*0.13;
        return amt;
    }
    private double convertHkdollarDirham(double amt)
    {
        amt = amt*0.47;
        return amt;
    }
    private double convertHkdollarEuro(double amt)
    {
        amt = amt*0.11;
        return amt;
    }
}

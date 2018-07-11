package com.knoldus.radhika;

public class Euro {
    public static double findCurrency2(String currency2,double amt) {
        Euro euro=new Euro();
        double Amount=0;
        if(currency2.equals("INR"))
            Amount=euro.convertEuroInr(amt);
        if(currency2.equals("Usdollar"))
            Amount= euro.convertEuroUsdollar(amt);
        if(currency2.equals("Hkdollar"))
            Amount= euro.convertEuroHkdollar(amt);
        if(currency2.equals("Dirham"))
            Amount=euro.convertEuroDirham(amt);
        return Amount;
    }


    private double convertEuroInr(double amt)
    {
        amt = amt*0.11;
        return amt;
    }
    private double convertEuroUsdollar(double amt)
    {
        amt = amt*1.18;
        return amt;
    }
    private double convertEuroHkdollar(double amt)
    {
        amt = amt*9.23;
        return amt;
    }
    private double convertEuroDirham(double amt)
    {
        amt = amt*4.32;
        return amt;
    }
}

package com.knoldus.radhika;

public class Dirham {

    public static double findCurrency2(String currency2,double amt) {
        Dirham dirham=new Dirham();
        double amount=0;
        if(currency2.equals("INR"))
            amount=dirham.convertDirhamInr(amt);
        if(currency2.equals("Usdollar"))
            amount= dirham.convertDirhamUsdollar(amt);
        if(currency2.equals("Hkdollar"))
            amount= dirham.convertDirhamHkdollar(amt);
        if(currency2.equals("Euro"))
            amount=dirham.convertDirhamEuro(amt);
        return amount;
    }


    private double convertDirhamInr(double amt)
    {
        amt = amt*18.72;
        return amt;
    }
    private double convertDirhamUsdollar(double amt)
    {
        amt = amt*0.27;
        return amt;
    }
    private double convertDirhamHkdollar(double amt)
    {
        amt = amt*2.14;
        return amt;
    }
    private double convertDirhamEuro(double amt)
    {
        amt = amt* 0.23;
        return amt;
    }
}

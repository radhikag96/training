package com.knoldus.radhika;

public class INR {
    public static double findCurrency2(String currency2,double amt) {
        INR rs=new INR();
        double amount=0;
        if(currency2.equals("EURO"))
            amount=rs.convertInrEuro(amt);
        if(currency2.equals("Usdollar"))
            amount= rs.convertInrUsdollar(amt);
        if(currency2.equals("Dirham"))
            amount=rs.convertInrDirham(amt);
        if(currency2.equals("Hkdollar"))
            amount= rs.convertInrHkdollar(amt);

        return amount;

    }


    private double convertInrEuro(double amt)
    {
        amt = amt*0.012;
        return amt;
    }
    private double convertInrUsdollar(double amt)
    {
        amt = amt*0.015;
        return amt;
    }
    private double convertInrDirham(double amt)
    {
        amt = amt*0.053;
        return amt;
    }
    private double convertInrHkdollar(double amt)
    {
        amt = amt*0.11;
        return amt;
    }

}

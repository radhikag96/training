package com.knoldus.radhika;

public class Usdollar {
    public static double findCurrency2(String currency2, double amt) {

        Usdollar dollar=new Usdollar();
        double amount=0;
        if (currency2.equals("EURO"))
            amount=dollar.convertUsdollarEuro(amt);
        if (currency2.equals("INR"))
            amount=dollar.convertUsdollarInr(amt);
        if (currency2.equals("Dirham"))
            amount=dollar.convertUsdollarDirham(amt);
        if (currency2.equals("Hkdollar"))
            amount=dollar.convertUsdollarHkdollar(amt);
        return amount;
    }


    private double convertUsdollarInr(double amt) {
        amt = amt * 68.95;
        return amt;
    }

    private double convertUsdollarEuro(double amt) {
        amt = amt * 0.857;
        return amt;
    }

    private double convertUsdollarHkdollar(double amt) {
        amt = amt * 7.85;
        return amt;
    }

    private double convertUsdollarDirham(double amt) {
        amt = amt * 3.67;
        return amt;
    }
}

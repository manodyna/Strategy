package com.logicalconstant;

public class SilverPriceStrategy implements CustomerPriceStrategy{
    @Override
    public double calculatePrice(double amount) {
        return amount*0.06;
    }
}

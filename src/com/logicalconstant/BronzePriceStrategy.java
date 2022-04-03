package com.logicalconstant;

public class BronzePriceStrategy implements CustomerPriceStrategy{
    @Override
    public double calculatePrice(double amount) {
        return 0.4*amount;
    }
}

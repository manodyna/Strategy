package com.logicalconstant;

public class GoldPriceStrategy implements  CustomerPriceStrategy{

    @Override
    public double calculatePrice(double amount) {
        return amount*0.08;
    }
}

package com.logicalconstant;

import static com.logicalconstant.CustomerType.bronzeCustomer;

public class Main {

    public static void main(String[] args) {
	 CustomerPriceStrategy strategy = new GoldPriceStrategy();
     double a = strategy.calculatePrice(1200);
        System.out.println(a);
        strategy = new SilverPriceStrategy();
        a = strategy.calculatePrice(122);
        System.out.println(a);
    }
}

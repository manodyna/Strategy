package com.logicalconstant;

import static com.logicalconstant.CustomerType.bronzeCustomer;

public class Main {

    public static void main(String[] args) {
	 SwitchCase switchCase = new SwitchCase();
     double a = switchCase.calculatePrice(bronzeCustomer, 20, 9);
        System.out.println(a);
    }
}

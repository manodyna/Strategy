package com.logicalconstant;

public class SwitchCase {
    public static double calculatePrice(CustomerType type, double totalAmount, double shipping){
        double price = 0;
        switch (type){
            case goldCustomer:
                price = (totalAmount*0.90)+shipping;
                break;
            case silverCustomer:
                price = (totalAmount*0.95)+shipping;
                break;
            case bronzeCustomer:
                price = (totalAmount*0.98)+shipping;
        }
        return price;
    }
}

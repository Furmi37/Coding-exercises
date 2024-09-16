package com.furmi.katas;

public class MoneyMoneyMoney {

    public static int calculateYears(double principal, double interest,  double tax, double desired) {
        // your code
        int years = 0;
        while (principal < desired) {
            years++;
            principal += (principal * interest) - (principal * interest * tax);
        }
        return years;

    }
}

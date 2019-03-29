package com.assignment.refactor;

public class NewRelease implements PriceCode {
    private static double rent = 3;
    private static int value = 2;


    @Override
    public double getTotalRent(int daysRented) {
        return daysRented * rent;
    }

    @Override
    public int getFrequentRenterPoints(int daysRented) {
        if(daysRented >1) return 1;
        return 0;
    }

    @Override
    public int getValue() {
        return value;
    }
}

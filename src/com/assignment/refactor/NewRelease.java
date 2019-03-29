package com.assignment.refactor;

public class NewRelease implements PriceCode {
    private static double rent = 3;

    @Override
    public double getTotalRent(int daysRented) {
        return daysRented * rent;
    }

    @Override
    public int getFrequentRenterPoints(int daysRented) {
        if(daysRented >1) return 1;
        return 0;
    }

}

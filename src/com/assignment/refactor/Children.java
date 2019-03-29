package com.assignment.refactor;

public class Children implements PriceCode {
    private static double initialRent = 1.5;
    private static int delayTime = 3;
    private static double delayRent = 1.5;

    @Override
    public double getTotalRent(int daysRented) {
        double totalRent = initialRent;
        if (daysRented > delayTime) {
            totalRent += (daysRented - delayTime) * delayRent;
        }
        return totalRent;
    }

    @Override
    public int getFrequentRenterPoints(int daysRented) {
        return 0;
    }

}


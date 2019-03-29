package com.assignment.refactor;

public class Regular implements PriceCode {
    private static double initialRent = 2;
    private static int delayTime = 2;
    private static double delayRent = 1.5;
    private static int value = 2;

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

    @Override
    public int getValue() {
        return value;
    }
}

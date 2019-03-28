package com.assignment.refactor;

public enum PriceCode {
    REGULAR(2,2,1.5),
    NEW_RELEASE(0,0,3),
    CHILDREN(1.5,3,1.5);

    private double initialRent;
    private int delayTime;
    private double delayRent;

    PriceCode(double initialRent, int delayTime, double delayRent) {
        this.initialRent = initialRent;
        this.delayTime = delayTime;
        this.delayRent = delayRent;
    }

    public double getTotalRent(int daysRented){
        double totalRent = this.initialRent;
        if(daysRented > this.delayTime){
            totalRent += (daysRented-this.delayTime) * this.delayRent;
        }
        return totalRent;
    }
}

package com.assignment.refactor;

public interface Formatter {
    void addRentDetails(String movie, double rent);
    void addAmountDetails(double amount);
    void addFrequencyPoints(int points);
    String getStatement();

}

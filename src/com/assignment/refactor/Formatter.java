package com.assignment.refactor;

public class Formatter {
    private String statement;

    public Formatter(String name) {
        this.statement = "Rental Record for " + name + "\n";
    }

    void addRentDetails(String movie, double rent) {
        statement += "\t" + movie + "\t" + rent + "\n";
    }

    void addAmountDetails(double amount) {
        statement += "Amount owed is " + amount + "\n";
    }

    void addFrequencyPoints(int points) {
        statement += "You earned " + points + " frequent renter points";
    }

    String getStatement() {
        return statement;
    }
}

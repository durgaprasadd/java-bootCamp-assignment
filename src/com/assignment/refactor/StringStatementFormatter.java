package com.assignment.refactor;

public class StringStatementFormatter implements  Formatter{
    private String statement;

    StringStatementFormatter(String name) {
        this.statement = "Rental Record for " + name + "\n";
    }

    @Override
    public void addRentDetails(String movie, double rent) {
        statement += "\t" + movie + "\t" + rent + "\n";
    }

    @Override
    public void addAmountDetails(double amount) {
        statement += "Amount owed is " + amount + "\n";
    }

    @Override
    public void addFrequencyPoints(int points) {
        statement += "You earned " + points + " frequent renter points";
    }

    @Override
    public String getStatement() {
        return statement;
    }
}

package com.assignment.refactor;

public class HtmlStatementFormatter implements Formatter{
    private String statement;

    HtmlStatementFormatter(String name) {
        this.statement = "<H1>Rentals for <EM>"+name+"</EM></H1><P>";
    }

    @Override
    public void addRentDetails(String movie, double rent) {
        statement+=movie+": "+rent+"<BR>";
    }

    @Override
    public void addAmountDetails(double amount) {
        statement+="<P>You owe <EM>"+amount+"</EM><P>";
    }

    @Override
    public void addFrequencyPoints(int points) {
        statement+="On this rental you earned <EM>"+points+"</EM> frequent renter points<P>";
    }

    @Override
    public String getStatement() {
        return statement;
    }
}

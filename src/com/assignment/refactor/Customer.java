package com.assignment.refactor;

class Customer {

    private String name;
    private RentalList rentalList;

    Customer(String name) {
        this.name = name;
        this.rentalList = new RentalList();
    }

    void addRental(Rental rental) {
        this.rentalList.addRental(rental);
    }

    String statement() {
        Formatter formatter = new StringStatementFormatter(name);
        return this.rentalList.getStatement(formatter);
    }

    String htmlStatement() {
        Formatter formatter = new HtmlStatementFormatter(name);
        return this.rentalList.getStatement(formatter);
    }
}

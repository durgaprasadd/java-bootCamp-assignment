package com.assignment.refactor;

import java.util.ArrayList;

class Customer {

    private String name;
    private ArrayList<Rental> rentalList = new ArrayList<>();

    Customer(String name) {
        this.name = name;
    }

    void addRental(Rental arg) {
        rentalList.add(arg);
    }

    String statement() {
        double totalAmount = 0;
        int frequentRenterPoints = rentalList.size();
        Formatter result = new Formatter(name);

        for (Rental rental : rentalList) {

            final int daysRented = rental.getDaysRented();
            final Movie movie = rental.getMovie();
            final PriceCode priceCode = movie.getPriceCode();

            // add bonus for a two day new release rental
            if ((priceCode == PriceCode.NEW_RELEASE) && daysRented > 1)
            frequentRenterPoints++;

            // show figures for this rental
            double totalRent = priceCode.getTotalRent(daysRented);
            result.addRentDetails(movie.getTitle(),totalRent);

            totalAmount += totalRent;

        }
        // add footer lines
        result.addAmountDetails(totalAmount);
        result.addFrequencyPoints(frequentRenterPoints);
        return result.getStatement();
    }

}

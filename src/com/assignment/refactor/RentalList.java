package com.assignment.refactor;

import java.util.ArrayList;

class RentalList {
    private ArrayList<Rental> rentalList;

    RentalList() {
        rentalList = new ArrayList<>();
    }

    void addRental(Rental rental) {
        rentalList.add(rental);
    }

    String getStatement(String name) {
        double totalAmount = 0;
        int frequentRenterPoints = rentalList.size();
        Formatter result = new Formatter(name);
        for (Rental rental : rentalList) {
            final Movie movie = rental.getMovie();
            frequentRenterPoints += rental.getFrequentRenterPoints();
            double totalRent = rental.calculateTotalRent();
            result.addRentDetails(movie.getTitle(), totalRent);
            totalAmount += totalRent;
        }
        result.addAmountDetails(totalAmount);
        result.addFrequencyPoints(frequentRenterPoints);
        return result.getStatement();
    }
}

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

    String getStatement(Formatter formatter) {
        double totalAmount = 0;
        int frequentRenterPoints = rentalList.size();
        for (Rental rental : rentalList) {
            final Movie movie = rental.getMovie();
            frequentRenterPoints += rental.getFrequentRenterPoints();
            double totalRent = rental.calculateTotalRent();
            formatter.addRentDetails(movie.getTitle(), totalRent);
            totalAmount += totalRent;
        }
        formatter.addAmountDetails(totalAmount);
        formatter.addFrequencyPoints(frequentRenterPoints);
        return formatter.getStatement();
    }
}

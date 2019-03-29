package com.assignment.refactor;

class Rental {

    private Movie movie;

    private int daysRented;

    Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    Movie getMovie() {
        return movie;
    }

    double calculateTotalRent() {
        return this.movie.calculateTotalRent(this.daysRented);
    }

    int getFrequentRenterPoints(){
        return this.movie.getFrequentRenterPoints(this.daysRented);
    }
}
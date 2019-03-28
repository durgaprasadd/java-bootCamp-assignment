package com.assignment.refactor;

class Movie {
    private String title;
    private PriceCode priceCode;

    Movie(String title, PriceCode priceCode) {
        this.title = title;
        this.priceCode = priceCode;
    }

    PriceCode getPriceCode() {
        return priceCode;
    }

    void setPriceCode(PriceCode priceCode) {
        this.priceCode = priceCode;
    }

    String getTitle() {
        return title;
    }
}


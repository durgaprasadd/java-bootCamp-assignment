package com.assignment.refactor;

class Movie {
    static final int CHILDREN = 2;
    static final int REGULAR = 0;
    static final int NEW_RELEASE = 1;

    private String title;
    private PriceCode priceCode;

    Movie(String title, int priceCode) {
        this.title = title;
        PriceCodeFactory priceCodeFactory = new PriceCodeFactory();
        this.priceCode = priceCodeFactory.getPriceCode(priceCode);
    }

    void setPriceCode(int priceCode) {
        PriceCodeFactory priceCodeFactory = new PriceCodeFactory();
        this.priceCode = priceCodeFactory.getPriceCode(priceCode);
    }

    String getTitle() {
        return title;
    }

    double calculateTotalRent(int daysRented) {
        return this.priceCode.getTotalRent(daysRented);
    }

    int getFrequentRenterPoints(int daysRented) {
        return this.priceCode.getFrequentRenterPoints(daysRented);
    }
}


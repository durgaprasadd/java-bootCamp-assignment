package com.assignment.refactor;

class PriceCodeFactory {
    PriceCode getPriceCode(int priceCode){
        if(priceCode == 0) return new Regular();
        if(priceCode == 1) return new NewRelease();
        if(priceCode == 2) return new Children();
        return null;
    }
}

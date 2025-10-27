package com.example.payment;

public class CreditCardPaymentStrategy implements Payment {
    private final String cardNumber;

    public CreditCardPaymentStrategy(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public boolean pay(double amount) {
        return amount >= 0;
    }

    @Override
    public String name() {
        return "CREDIT_CARD";
    }
}

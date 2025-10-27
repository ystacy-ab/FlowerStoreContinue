package com.example.payment;

public class PayPalPaymentStrategy implements Payment {
    private final String account;

    public PayPalPaymentStrategy(String account) {
        this.account = account;
    }

    @Override
    public boolean pay(double amount) {
        return amount >= 0;
    }

    @Override
    public String name() {
        return "PAYPAL";
    }
}

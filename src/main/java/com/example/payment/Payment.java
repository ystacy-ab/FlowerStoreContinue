package com.example.payment;

public interface Payment {
    boolean pay(double amount);
    String name();
}

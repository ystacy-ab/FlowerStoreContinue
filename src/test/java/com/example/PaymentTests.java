package com.example;

import org.junit.jupiter.api.Test;

import com.example.payment.CreditCardPaymentStrategy;
import com.example.payment.PayPalPaymentStrategy;
import com.example.payment.Payment;

import static org.junit.jupiter.api.Assertions.*;

public class PaymentTests {
    @Test
    public void creditPays() {
        Payment p = new CreditCardPaymentStrategy("4111");
        assertTrue(p.pay(10.0));
    }

    @Test
    public void paypalPays() {
        Payment p = new PayPalPaymentStrategy("acc");
        assertTrue(p.pay(0.0));
    }
}

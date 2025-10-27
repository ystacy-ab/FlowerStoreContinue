package com.example.controller;

import com.example.delivery.DHLDeliveryStrategy;
import com.example.delivery.Delivery;
import com.example.delivery.PostDeliveryStrategy;
import com.example.order.Item;
import com.example.order.Order;
import com.example.payment.CreditCardPaymentStrategy;
import com.example.payment.PayPalPaymentStrategy;
import com.example.payment.Payment;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class OrderController {
    @GetMapping("/sample")
    public Order sampleOrder() {
        Order order = new Order();
        order.addItem(new Item(null,1));
        return order;
    }

    @PostMapping("/pay")
    public String pay(@RequestParam double amount, @RequestParam String method) {
        Payment p;
        if ("paypal".equalsIgnoreCase(method)) {
            p = new PayPalPaymentStrategy("user@example.com");
        } else {
            p = new CreditCardPaymentStrategy("4111111111111111");
        }
        boolean ok = p.pay(amount);
        return p.name() + " paid: " + ok;
    }

    @GetMapping("/deliver")
    public String deliver(@RequestParam String address, @RequestParam String type) {
        Delivery d;
        if ("dhl".equalsIgnoreCase(type)) {
            d = new DHLDeliveryStrategy();
        } else {
            d = new PostDeliveryStrategy();
        }
        return d.name() + " -> " + d.deliver(address);
    }

    @GetMapping("/payments")
    public List<String> payments() {
        return List.of(new CreditCardPaymentStrategy("x").name(), new PayPalPaymentStrategy("x").name());
    }

    @GetMapping("/deliveries")
    public List<String> deliveries() {
        return List.of(new PostDeliveryStrategy().name(), new DHLDeliveryStrategy().name());
    }
}

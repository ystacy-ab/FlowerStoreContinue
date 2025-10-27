package com.example.delivery;

public class DHLDeliveryStrategy implements Delivery {
    @Override
    public String deliver(String address) {
        return "DHL to " + address;
    }

    @Override
    public String name() {
        return "DHL";
    }
}

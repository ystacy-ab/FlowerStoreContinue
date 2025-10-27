package com.example.delivery;

public class PostDeliveryStrategy implements Delivery {
    @Override
    public String deliver(String address) {
        return "Post to " + address;
    }

    @Override
    public String name() {
        return "POST";
    }
}

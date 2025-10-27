package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DeliveryTests {
    @Test
    public void postDelivers() {
        Delivery d = new PostDeliveryStrategy();
        assertEquals("Post to addr", d.deliver("addr"));
    }

    @Test
    public void dhlDelivers() {
        Delivery d = new DHLDeliveryStrategy();
        assertEquals("DHL to addr", d.deliver("addr"));
    }
}

package com.example.order;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Order {
    private final List<Item> items = new ArrayList<>();
    private double total;

    public void addItem(Item item) {
        items.add(item);
        recalc();
    }

    public void recalc() {
        total = items.stream().mapToDouble(Item::getPrice).sum();
    }
}

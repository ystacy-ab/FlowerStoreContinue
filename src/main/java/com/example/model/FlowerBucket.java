package com.example.model;

import java.util.ArrayList;
import java.util.List;

public class FlowerBucket {
    private final List<FlowerPack> flowerPacks = new ArrayList<>();

    public void addFlowerPack(FlowerPack pack) {
        flowerPacks.add(pack);
    }
    
    public void add(FlowerPack pack) {
        addFlowerPack(pack);
    }

    public double getPrice() {
        return flowerPacks.stream()
                .mapToDouble(FlowerPack::getPrice)
                .sum();
    }

    public List<FlowerPack> getFlowerPacks() {
        return flowerPacks;
    }
}
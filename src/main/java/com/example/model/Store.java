package com.example.model;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private final List<FlowerBucket> buckets = new ArrayList<>();

    public void addBucket(FlowerBucket bucket) {
        buckets.add(bucket);
    }

    public List<FlowerBucket> search(Flower flower) {
        List<FlowerBucket> result = new ArrayList<>();
        for (FlowerBucket bucket : buckets) {
            for (FlowerPack pack : bucket.getFlowerPacks()) {
                Flower f = pack.getFlower();
                if (f.getFlowerType() == flower.getFlowerType()
                        && f.getColor().equals(flower.getColor())
                        && f.getSepalLength() == flower.getSepalLength()) {
                    result.add(bucket);
                    break;
                }
            }
        }
        return result;
    }
}

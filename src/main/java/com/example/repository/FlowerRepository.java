package com.example.repository;

import com.example.model.Flower;
import com.example.model.FlowerColor;
import com.example.model.FlowerType;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class FlowerRepository {
    private final List<Flower> storage = new ArrayList<>();

    public FlowerRepository() {
        storage.add(new Flower(FlowerType.Rose,5.0,FlowerColor.RED,10.0));
        storage.add(new Flower(FlowerType.Tulip,4.0,FlowerColor.PINK,7.5));
        storage.add(new Flower(FlowerType.Chamomile,3.5,FlowerColor.WHITE,3.0));
    }

    public List<Flower> findAll() {
        return List.copyOf(storage);
    }

    public void add(Flower f) {
        storage.add(f);
    }
}

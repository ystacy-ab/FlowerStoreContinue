package com.example;

public class Main {
    public static void main(String[] args) {
        Flower rose = new Flower(5.0, FlowerColor.RED, 15.0, FlowerType.Rose);
        FlowerPack pack = new FlowerPack(rose, 3);
        FlowerBucket bucket = new FlowerBucket();
        bucket.addFlowerPack(pack);

        Store store = new Store();
        store.addBucket(bucket);

        System.out.println("Bucket price: " + bucket.getPrice());
        System.out.println("Search result size: " + store.search(rose).size());
    }
}

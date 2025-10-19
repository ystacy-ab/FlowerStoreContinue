package com.example;

public enum FlowerType {
    Chamomile, Rose, Tulip;

    @Override
    public String toString() {
        return this.name();
    }
}
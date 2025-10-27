package com.example.model;

public enum FlowerType {
    Chamomile, Rose, Tulip;

    @Override
    public String toString() {
        return this.name();
    }
}
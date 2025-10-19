package com.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

@Getter @Setter 
@AllArgsConstructor
@NoArgsConstructor
public class Flower {
    private double sepalLength;
    private FlowerColor color;
    private double price;
    private FlowerType flowerType;

    public String getColor() {
        return color.toString();
    }
    
    public double getPrice() {
        return price;
    }
    
    public FlowerType getFlowerType() {
        return flowerType;
    }
    
    public double getSepalLength() {
        return sepalLength;
    }
}
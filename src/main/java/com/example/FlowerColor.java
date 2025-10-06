package com.example;

public enum FlowerColor {
    RED("#FF0000"), GREEN("#00FF00"), BLUE("#0000FF");
    private String hexColor;

    FlowerColor(String hexColor){
        this.hexColor = hexColor;
    }
}

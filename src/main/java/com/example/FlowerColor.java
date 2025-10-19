package com.example;

public enum FlowerColor {
    RED("#FF0000"),
    WHITE("#FFFFFF"),
    YELLOW("#FFFF00"),
    PINK("#FFC0CB");

    private final String code;

    FlowerColor(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return code;
    }
}

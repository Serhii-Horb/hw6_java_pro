package org.example.Ex2;

public class Sneakers extends Item{
    private double height;
    private double length;
    private double width;

    public Sneakers(double height, double length, double width) {
        this.height = height;
        this.length = length;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
}

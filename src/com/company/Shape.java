package com.company;

public abstract class Shape {
    private double a;

    public Shape(int a) {
        this.a = a;
    }

    public abstract double getPerimeter();

    public double getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}

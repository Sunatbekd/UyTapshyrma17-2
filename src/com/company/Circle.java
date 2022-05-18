package com.company;

public class Circle extends Shape {
    static final double PI = Math.PI;


    public Circle(double a) {
        super((int) a);

    }

    @Override
    public double getPerimeter() {
        double perimetr = 2 * getA() * PI;
        return perimetr;
    }
}
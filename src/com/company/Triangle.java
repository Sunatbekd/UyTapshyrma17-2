package com.company;

public class Triangle extends Shape{
    double b;
    double c;

    public Triangle(double a, double b, double c) {
        super((int) a);
        this.b = b;
        this.c = c;
    }

    @Override
    public double getPerimeter() {
        double perimetr = getA()+b+c;
        return perimetr;
    }

}

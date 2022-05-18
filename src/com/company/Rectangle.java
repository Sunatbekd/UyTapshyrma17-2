package com.company;

public class Rectangle extends Shape{
    double b;

    public Rectangle(double a, double b) {
        super((int) a);
        this.b = b;
    }

    @Override
    public double getPerimeter() {
        double perimetr = (getA()*2)+(b*2);
        return perimetr;
    }
}

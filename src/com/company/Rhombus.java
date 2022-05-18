package com.company;

public class Rhombus extends Shape{

    public Rhombus(double a) {
        super((int) a);

    }

    @Override
    public double getPerimeter() {
        double perimetr =getA()*4;
        return perimetr;
    }
}

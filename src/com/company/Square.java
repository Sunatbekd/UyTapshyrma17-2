package com.company;

public class Square extends Shape{


    public Square(double a) {
        super((int) a);
    }

    @Override
    public double getPerimeter() {
        double perimetr = getA()*4;
        return perimetr;
    }
}

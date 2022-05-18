package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение сторон квадрата:");
        double a = scanner.nextDouble();
        Shape square = new Square(a);
        System.out.println("Периметр квадрата = "+square.getPerimeter());

        System.out.println("Введите значение сторон треугольника:");
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double a1 = scanner.nextDouble();
        Shape triangle = new Triangle(a1,b,c);
        System.out.println("Периметр треугольника = "+triangle.getPerimeter());

        System.out.println("Введите значение радиуса круга:");
        double r = scanner.nextDouble();
        Shape circle = new Circle(r);
        System.out.println("Периметр круга = "+circle.getPerimeter());

        System.out.println("Введите значение сторон прямоугольника:");
        double a3 = scanner.nextByte();
        double b1 = scanner.nextByte();
        Shape rectangle = new Rectangle(a3,b1);
        System.out.println("Периметр прямоугольника = "+rectangle.getPerimeter());

        System.out.println("Введите значение сторон ромба:");
        double a4 = scanner.nextByte();
        Shape rhombus = new Rhombus(a4);
        System.out.println("Периметр ромба = "+rhombus.getPerimeter());

    }
}

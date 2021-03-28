package ru.sofronov01;
import java.lang.Math;

public class Circle extends GeometricFigure {
    private final double diameter;
    private final double PI = 3.14;

    public Circle(double diameter) {
        super();
        this.diameter = diameter;
    }

    @Override
    public double getPerimeter() {
        return (PI+PI)*diameter;
    }

    @Override
    public double getArea() {
        return ((diameter/2)*(diameter/2))*PI;
    }

}

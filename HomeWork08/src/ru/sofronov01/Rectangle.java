package ru.sofronov01;

public class Rectangle extends GeometricFigure {
    private final double width;
    private final double height;
    public Rectangle(double width, double height) {
        super();
        this.width = width;
        this.height = height;
    }

    @Override
    public double getPerimeter() {
        return (width + height) * 2;
    }

    @Override
    public double getArea() {
        return width * height;
    }
}
